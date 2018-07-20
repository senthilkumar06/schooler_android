package com.randomthoughts.schooler.network.dependancyinjection

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.NetworkInterface

@Module
class ApiModule(val baseUrl: String) {
    @Provides
    fun provideApiService(): NetworkInterface {
        val gson = GsonBuilder().create()
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build().create(NetworkInterface::class.java)
    }
}