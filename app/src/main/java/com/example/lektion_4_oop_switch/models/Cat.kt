package com.example.lektion_4_oop_switch.models

// Implements Animal = : Animal (kotlin)
class Cat: IAnimal, Animal() {


    override fun eat() {
        println("nom nom")
    }

    override fun sleep() {
        println("Zzzzz")
    }

    override fun makeSound() {
        println("Meow")
    }

    override fun reproduce() {
        println("Aggrevated sound")
    }


}