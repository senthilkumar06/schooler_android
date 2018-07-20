package com.randomthoughts.schooler.network.dependancyinjection

import com.randomthoughts.schooler.network.Network.BaseRepository
import com.randomthoughts.schooler.network.Network.BaseRepositoryImpl
import com.randomthoughts.schooler.network.NetworkInterface
import dagger.Module
import dagger.Provides

@Module
class BaseRepositoryModule {

    @Provides
    fun provideBaseRepository(apiService: NetworkInterface): BaseRepository = BaseRepositoryImpl(apiService)
}