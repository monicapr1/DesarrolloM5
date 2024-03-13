package com.example.heroesapp.mockdata

import com.example.heroesapp.models.User

class MockData{
    companion object{
        val users = listOf<User>(
            User("monica@gmail.com","123456"),
            User("example@gmail.com","123456"),
            User("pancho@gmail.com","123456")
        )

        fun getUsers(){
            println("Get users")
        }
    }
}