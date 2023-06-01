package com.example.demo.data

import com.example.demo.controller.dto.UserDto
import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "users")
data class User(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id var id: Long?,
    var name: String,
    var email: String,
    var created: Date
){
    constructor(): this(null,"","",Date())
    constructor(userDto: UserDto) : this(null, userDto.name, userDto.email, Date())
}
