package com.example.lektion_4_oop_switch.models

// PRIMARY & SECONDARY CONSTRUCTOR
class Student(
    private val firstName: String,
    private val lastName: String
) {

    fun speak() {
        println("Hello there! Nice to meet you!")
    }

    fun introduceMyself() {
        println("Hello my name is $firstName , $lastName")
    }

    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName')"
    }

    // Command + N / CTRL + N


}

