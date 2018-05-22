package com.sonny.demo.CoffeeShopDemo.machine

import com.sonny.demo.CoffeeShopDemo.bag.CaramelMacchiatoPackage
import com.sonny.demo.CoffeeShopDemo.machine.behavior.grind.GrindBehavior
import com.sonny.demo.CoffeeShopDemo.machine.behavior.grind.ThinGrind
import com.sonny.demo.CoffeeShopDemo.machine.behavior.mik.CreateFoamedMilk
import com.sonny.demo.CoffeeShopDemo.machine.behavior.mik.MilkBehavior
import com.sonny.demo.CoffeeShopDemo.machine.behavior.sugar.SugarBehavior
import com.sonny.demo.CoffeeShopDemo.machine.behavior.sugar.SugarHandler

class CaramelMacchiatoCoffeeMachine(bag: CaramelMacchiatoPackage):Machine<CaramelMacchiatoPackage>(bag){

    private var grindBehavior: GrindBehavior = ThinGrind()
    private var sugarBehavior: SugarBehavior = SugarHandler()
    private var milkBehavior: MilkBehavior = CreateFoamedMilk()

    override fun showCoffeeMachineName() {
        println("This is a Caramel Macchiato Coffee Machine!")
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

        println()

        println("Take out " + bag.getMilk().getMilkName())
        milkBehavior.handleMilk(bag.getMilk())

    }

    override fun completeCoffee() {
        println("Caramel Macchiato Coffee is completed")
    }

}