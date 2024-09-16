package com.example.composenavigation

interface ErrorHandler {

    fun errorHandlerCustom()


    fun printError(
        message: String,
        ip: String,
    ) {
        println(message)
        println("userIp is : $ip")
    }
}

class NewErrorHandler : ErrorHandler {
    override fun errorHandlerCustom() {
        // this is not interface Segregation -> نقض اصل چهارم
    }

    override fun printError(message: String, ip: String) {
        super.printError(message, ip)
        println("override the function")
    }
}


/*
dependency inversion -> کلاس های سطح بالا نباید به کلاس های سطح پایین وابستگی داشته باشن
 */


