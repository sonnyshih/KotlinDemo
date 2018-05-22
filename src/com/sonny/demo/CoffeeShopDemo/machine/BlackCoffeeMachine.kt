package com.sonny.demo.CoffeeShopDemo.machine

import com.sonny.demo.CoffeeShopDemo.bag.BlackCoffeePackage
import com.sonny.demo.CoffeeShopDemo.machine.behavior.grind.CoarseGrind
import com.sonny.demo.CoffeeShopDemo.machine.behavior.grind.GrindBehavior
import com.sonny.demo.CoffeeShopDemo.machine.behavior.sugar.SugarBehavior
import com.sonny.demo.CoffeeShopDemo.machine.behavior.sugar.SugarHandler

class BlackCoffeeMachine(bag: BlackCoffeePackage) : Machine<BlackCoffeePackage>(bag) {

    private var grindBehavior: GrindBehavior = CoarseGrind()
    private var sugarBehavior: SugarBehavior = SugarHandler()


    override fun showCoffeeMachineName() {
        println("This is a Black Coffee Machine!")
    }

    override fun isValidateCoffeeBag(): Boolean {

        return true
    }

    override fun startCookCoffee() {
        println("take out " + bag.getCoffee().getCoffeeName())
        grindBehavior.grindBean(bag.getCoffee())

        println()

        println("Take out " + bag.getSugar().getSugarName())
        sugarBehavior.addSugar(bag.getSugar())
    }

    override fun completeCoffee() {
        println("Black Coffee is completed")
    }


}