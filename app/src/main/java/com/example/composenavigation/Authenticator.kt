package com.example.composenavigation

interface Authenticator {
    fun sigInWithUserNameAndPassword(userName: String, password: String): Boolean
}

class RestAuth : Authenticator {
    private val userName = "AliAmrol"
    private val password = "Aliamrol81"

    override fun sigInWithUserNameAndPassword(userName: String, password: String): Boolean {
        return this.userName == userName && this.password == password
    }
}

class FakeAuth : Authenticator {
    private val userName = "AliAmrol"
    private val password = "Aliamrol81"

    override fun sigInWithUserNameAndPassword(userName: String, password: String): Boolean {
        return this.userName == userName && this.password == password
    }
}
