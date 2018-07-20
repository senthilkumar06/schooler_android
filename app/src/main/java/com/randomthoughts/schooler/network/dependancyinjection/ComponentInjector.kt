package com.randomthoughts.schooler.network.dependancyinjection

import com.randomthoughts.schooler.network.utils.Constants

class ComponentInjector {
    companion object {

        lateinit var signinComponent: AppComponent

        fun init() {
            signinComponent = DaggerAppComponent.builder()
                    .apiModule(ApiModule(Constants.SIGNIN_URL))
                    .speciesRepositoryModule(BaseRepositoryModule())
                    .build()
        }
    }
}