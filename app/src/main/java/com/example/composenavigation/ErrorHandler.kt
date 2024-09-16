package com.example.composenavigation

class ErrorHandler {


    fun printError(
        message: String,
        ip: String,
    ) {
        println(message)
        println("userIp is : $ip")
    }
}