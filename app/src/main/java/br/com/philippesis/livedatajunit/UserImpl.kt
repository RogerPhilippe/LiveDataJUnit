package br.com.philippesis.livedatajunit

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext


class UserImpl {

    fun makeUser(viewModel: MainViewModel) = runBlocking {
        val user = User(1, "Roger Philippe")
        withContext(Dispatchers.IO) {
            Thread.sleep(3000)
            viewModel.currentUser().postValue(user)
        }
    }

}