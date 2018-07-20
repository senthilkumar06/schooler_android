package com.randomthoughts.schooler.network.signin

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.randomthoughts.schooler.network.Network.BaseRepository
import com.randomthoughts.schooler.network.model.User
import javax.inject.Inject

class SigininViewModel: ViewModel() {
    @Inject
    lateinit var repository: BaseRepository
    var isLoading = MutableLiveData<Boolean>()
    var apiError = MutableLiveData<Throwable>()
    var speciesResponse = MutableLiveData<List<User>>()
}