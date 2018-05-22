package com.sonny.demo.CoffeeShopDemo.machine.behavior.mik

import com.sonny.demo.CoffeeShopDemo.bag.material.milk.MilkMetarial

interface MilkBehavior {
    fun handleMilk (milk: MilkMetarial)
}