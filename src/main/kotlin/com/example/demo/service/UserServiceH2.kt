package com.example.demo.service

import com.example.demo.data.User
import com.example.demo.data.UserDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceH2(@Autowired private val userDao: UserDao) : UserService {

    override fun findById(id: Long): Optional<User> {
        return userDao.findById(id)
    }

    override fun create(user: User): User {
        return userDao.save(user)
    }

    override fun getAll(): Iterable<User> {
        return userDao.findAll()
    }
}