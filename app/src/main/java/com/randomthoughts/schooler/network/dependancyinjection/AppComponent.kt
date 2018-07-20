package com.randomthoughts.schooler.network.dependancyinjection

import com.randomthoughts.schooler.network.signin.SigninViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            (ApiModule::class),
            (BaseRepositoryModule::class)
        ]
)
interface AppComponent {
    fun inject(singinViewModel: SigninViewModel)
}