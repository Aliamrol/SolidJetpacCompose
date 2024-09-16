package com.example.composenavigation

import androidx.navigation.NavController

class LoginRepository(
    private val auth: FakeAuth,
    private val newErrorHandler: NewErrorHandler,
    private val navController: NavController

) {
    fun loginUser(userName: String, password: String) {
        val isLogin = auth.sigInWithUserNameAndPassword(userName, password)
        if (isLogin) {
            println("user is login to system")
            navController.navigate(Screen.Second.withArgs(userName, password))
        } else {
            newErrorHandler.printError(
                "userName or password is incorrect",
                "8.8.8.8"
            ) // this is open/close
        }
    }

}

/*
open/close -> کلاس ها باید برای توسعه دادن باز و برای تغییر دادن بسته باشند
 */
