package com.sonny.demo.CoffeeShopDemo.machine.behavior.mik

import com.sonny.demo.CoffeeShopDemo.bag.material.milk.MilkMetarial

class CreateHotMilk: MilkBehavior {
    override fun handleMilk(milk: MilkMetarial) {
        println("Making the " + milk.getMilkName() + " to hot milk")
    }

}