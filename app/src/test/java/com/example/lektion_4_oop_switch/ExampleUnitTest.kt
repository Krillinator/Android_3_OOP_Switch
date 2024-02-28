package com.example.lektion_4_oop_switch

import com.example.lektion_4_oop_switch.models.Animal
import com.example.lektion_4_oop_switch.models.IAnimal
import com.example.lektion_4_oop_switch.models.Calculator
import com.example.lektion_4_oop_switch.models.Cat
import com.example.lektion_4_oop_switch.models.Dog
import com.example.lektion_4_oop_switch.models.Roles
import com.example.lektion_4_oop_switch.models.Student
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun instantiateObjects() {

        // Instantiate = when a VAR becomes a CLASS
        val benny = Student("Benny", "Johansson")   // params/args
        val frida = Student("Frida", "Anderson")    // params = constructor

        benny.speak()

        benny.introduceMyself()
        frida.introduceMyself()

        // println(benny)
        // println(frida)
    }

    @Test
    fun calculatorExperiment() {

        // Instantiate Objects
        val myCalculator = Calculator()

        // No Visible result within LOG
        // WHY = Because we do NOT print the result
        myCalculator.multiplication(725, 5)

        // Solution!
        println(myCalculator.multiplication(725, 5))

        // You can assign a variable, a return value
        val result = myCalculator.addition(25, 25)
        println(result)

    }


    @Test
    fun animalTest() {

        // Instantiate Objects
        val cat = Cat()
        val dog = Dog()

        cat.makeSound()
        dog.makeSound()

        val zoo = mutableListOf<Animal>()   // Polymorphism in action

        zoo.add(cat)
        zoo.add(dog)

        cat.amountOfLegs

    }

    @Test
    fun testRoles() {

        Roles.ARCHER.getDescription()

    }

}