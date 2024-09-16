package com.example.composenavigation

import androidx.navigation.NavController

class LoginRepository(
    private val auth: FakeAuth,
    private val errorHandler: ErrorHandler,
    private val navController: NavController

) {
    fun loginUser(userName: String, password: String) {
        val isLogin = auth.sigInWithUserNameAndPassword(userName, password)
        if (isLogin) {
            println("user is login to system")
            navController.navigate(Screen.Second.withArgs(userName, password))
        } else {
            errorHandler.printError("userName or password is incorrect", "8.8.8.8") // it is single responsibility
        }
    }

}

/*
single responsibility -> هر کلاس یا فانکشن صرفا یه کار مخصوص به خود را انجام میدهند
 */
