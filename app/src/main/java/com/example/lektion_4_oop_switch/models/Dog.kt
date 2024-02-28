package com.example.lektion_4_oop_switch.models

class Dog: IAnimal, Animal() {

    override fun eat() {
        println("Hoovering has started")
    }

    override fun sleep() {
        println("Gentle snores")
    }

    override fun makeSound() {
        println("BORK BORK")
    }

    override fun reproduce() {
        println("Some aggrevated noise")
    }
}