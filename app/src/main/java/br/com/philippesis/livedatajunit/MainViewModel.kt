package br.com.philippesis.livedatajunit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val currentUserLiveData = MutableLiveData<User>()

    fun currentUser() = currentUserLiveData

}
