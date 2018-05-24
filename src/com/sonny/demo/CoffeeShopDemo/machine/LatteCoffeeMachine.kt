package com.sonny.demo.CoffeeShopDemo.machine

import com.sonny.demo.CoffeeShopDemo.bag.LatteCoffeePackage
import com.sonny.demo.CoffeeShopDemo.machine.behavior.grind.GrindBehavior
import com.sonny.demo.CoffeeShopDemo.machine.behavior.grind.MiddleGrind
import com.sonny.demo.CoffeeShopDemo.machine.behavior.mik.CreateHotMilk
import com.sonny.demo.CoffeeShopDemo.machine.behavior.mik.MilkBehavior

class LatteCoffeeMachine(bag: LatteCoffeePackage): Machine<LatteCoffeePackage>(bag) {

    private var grindBehavior: GrindBehavior = MiddleGrind()
    private var milkBehavior: MilkBehavior = CreateHotMilk()

    override fun showCoffeeMachineName() {
        println("This is a Latte Coffee Machine!")
    }

    override fun isValidateCoffeeBag(): Boolean {
        return true
    }

    override fun startCookCoffee() {

        println("take out " + bag.getCoffee().getCoffeeName())
        Thread.sleep(1000)
        grindBehavior.grindBean(bag.getCoffee())

        println()

        Thread.sleep(1000)
        println("Take out " + bag.getMilk().getMilkName())

        Thread.sleep(1000)
        milkBehavior.handleMilk(bag.getMilk())

    }

    override fun completeCoffee() {
        println("Latte Coffee is completed")
    }

}