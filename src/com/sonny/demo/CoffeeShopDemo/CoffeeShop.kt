package com.sonny.demo.CoffeeShopDemo

import com.sonny.demo.CoffeeShopDemo.bag.BlackCoffeePackage
import com.sonny.demo.CoffeeShopDemo.bag.CaramelMacchiatoPackage
import com.sonny.demo.CoffeeShopDemo.bag.LatteCoffeePackage
import com.sonny.demo.CoffeeShopDemo.machine.BlackCoffeeMachine
import com.sonny.demo.CoffeeShopDemo.machine.CaramelMacchiatoCoffeeMachine
import com.sonny.demo.CoffeeShopDemo.machine.LatteCoffeeMachine

fun main(args: Array<String>) {

    println("/* ######################################## */")
    println("/* ##### Welcome to Sonny Coffee Shop ##### */")
    println("/* ######################################## */")
    println()

    showMenu()
}

fun showMenu(){
    println("Please Choose the coffee");
    println("1. Black Coffee");
    println("2. Latte Coffee");
    println("3. Caramel Macchiato Coffee");

    var no:String = readLine()!!

    if (no.toIntOrNull() == null) {
        println("Sorry! You dose not type a number.")
        println("Please type a number.")
        println()

        showMenu()

    } else {

        when(no.toInt()){
            1 -> produceBlackCoffee()   // Black Coffee
            2 -> produceLatteCoffee()   // Latte Coffee
            3 -> produceCaramelMacchiatoCoffee() // Caramel Macchiato Coffee
            else -> {
                println("Sorry! Choose one coffee")
                println()

                showMenu()
            }

        }
    }


}

fun produceBlackCoffee() {
    println("Black Coffee Processing...")
    var bag = BlackCoffeePackage()
    var machine = BlackCoffeeMachine(bag)
    machine.startMachine()

}

fun produceLatteCoffee() {
    println("Latte Coffee Processing...")
    var bag = LatteCoffeePackage()
    var machine = LatteCoffeeMachine(bag)
    machine.startMachine()

}

fun produceCaramelMacchiatoCoffee() {
    println("Caramel Macchiato Coffee Processing...")

    var bag = CaramelMacchiatoPackage()
    var machine = CaramelMacchiatoCoffeeMachine(bag)
    machine.startMachine()

}