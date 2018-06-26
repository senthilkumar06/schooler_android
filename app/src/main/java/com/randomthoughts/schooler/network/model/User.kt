package com.randomthoughts.schooler.network.model

data class User (
        val token: String = "",
        var name: String = "",
        var email: String = "",
        var picture: String = "",
        var locale: String = ""
)