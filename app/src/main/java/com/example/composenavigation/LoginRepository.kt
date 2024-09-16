package com.example.composenavigation

import androidx.navigation.NavController

class LoginRepository(
    private val auth: Authenticator,
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
dependency inversion -> کلاس های سطح بالا نباید به کلاس های سطح پایین وابسته باشن
 */


// dependency injection -> کلاس ها نباید از همدیگه شی بسازند
/*
اگر دیپندنسی اینجکشن را رعایت کنیم مستقیما دیپندسی اینورژن را رعایت میکنیم
 */