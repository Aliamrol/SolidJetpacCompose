package com.example.composenavigation

open class ErrorHandler {


    open fun printError(
        message: String,
        ip: String,
    ) {
        println(message)
        println("userIp is : $ip")
    }
}

class NewErrorHandler : ErrorHandler() {
    override fun printError(message: String, ip: String) {
        super.printError(message, ip)
        println("override the function")
    }
}