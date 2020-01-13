package br.com.philippesis.livedatajunit

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

class UserImplTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val userImpl = UserImpl()
    private val viewModel = MainViewModel()

    @Test
    fun userTest() {
        userImpl.makeUser(viewModel)
        val user = viewModel.currentUser().value
        Assert.assertNotNull(user)
        Assert.assertTrue(user?.name!!.isNotEmpty())
    }

}