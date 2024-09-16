package com.example.composenavigation

import androidx.navigation.NavController

class LoginRepository(
    private val auth: FakeAuth,
    private val navController: NavController

) {
    fun loginUser(userName: String, password: String) {
        val isLogin = auth.sigInWithUserNameAndPassword(userName, password)
        if (isLogin) {
            println("user is login to system")
            navController.navigate(Screen.Second.withArgs(userName, password))
        } else {
            println("username or password is incorrect")
            println("userIp is : 8.8.8.8")
        }
    }

}