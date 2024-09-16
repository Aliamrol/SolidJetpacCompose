package com.example.composenavigation

class FakeAuth {
    private val userName = "AliAmrol"
    private val password = "Aliamrol81"

    fun sigInWithUserNameAndPassword(userName: String, password: String): Boolean {
        return this.userName == userName && this.password == password
    }
}

/*
single responsibilty -> هر کلاس وظیفه مشخصی داشته باشد
 */