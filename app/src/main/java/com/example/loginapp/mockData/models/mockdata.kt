package com.example.loginapp.mockData.models

import com.example.loginapp.models.user

class mockdata {
    companion object{
        val users = listOf<user>(
            user("mp858@.gmsa.com", "1234"),
            user("mp858@.gmsa.com", "1234"),
            user("mp858@.gmsa.com", "d234")
        )
        fun getUser (){
            println("Get user")
        }
    }
}