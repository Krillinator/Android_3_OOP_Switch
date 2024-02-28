package com.example.lektion_4_oop_switch.models

enum class Roles(private val description: String) {

    WARRIOR("I'm a fighter"),
    MAGE("I'm a caster"),
    ARCHER("I'm a ranger");

    fun getDescription() {
        println(description)
    }

}