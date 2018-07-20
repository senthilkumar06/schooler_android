package com.randomthoughts.schooler.network.Network

import com.randomthoughts.schooler.network.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.randomthoughts.schooler.network.NetworkInterface

class BaseRepositoryImpl(private val apiService: NetworkInterface): BaseRepository {
    override fun signIn(successHandler: (User?) -> Unit, failureHandler: (Throwable?) -> Unit) {
        apiService.sigin().enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>?, response: Response<User>?) {
                response?.body()?.let {
                    successHandler(it)
                }
            }

            override fun onFailure(call: Call<User>?, t: Throwable?) {
                failureHandler(t)
            }
        })
    }
}

interface BaseRepository {

    fun signIn(successHandler: (User?) -> Unit, failureHandler: (Throwable?) -> Unit)

}