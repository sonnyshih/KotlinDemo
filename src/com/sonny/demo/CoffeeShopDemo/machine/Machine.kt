package com.sonny.demo.CoffeeShopDemo.machine

abstract class Machine<T> {

    protected var bag:T

    constructor(bag: T) {
        this.bag = bag
    }

    fun startMachine(){
        println("/* ######################### */")
        println("/* ##### Start machine ##### */")
        println("/* ######################### */")
        println()

        process()
    }

    private fun process() {
        var isvalidate:Boolean = isValidateCoffeeBag()

        if (isvalidate) {
            showCoffeeMachineName()
            cookeWater()
            startCookCoffee()
            completeCoffee()
        } else {
            showError()
        }

        stopMachine()
    }


    private fun stopMachine(){
        println()
        println("/* ######################## */")
        println("/* ##### Stop machine ##### */")
        println("/* ######################## */")
    }

    private fun showError(){
        println("The coffee bag is wrong.")
    }

    private fun cookeWater(){
        println("Cooking water...")
    }

    abstract fun showCoffeeMachineName()
    abstract fun isValidateCoffeeBag():Boolean
    abstract fun startCookCoffee()
    abstract fun completeCoffee()

}