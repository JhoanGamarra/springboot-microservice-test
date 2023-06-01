package com.example.demo.service

import com.example.demo.data.User
import java.util.Optional

interface UserService {

    fun findById(id : Long) : Optional<User>

    fun create(user: User) : User

    fun getAll() : Iterable<User>

}