package com.sonny.demo.CoffeeShopDemo.machine.behavior.grind

import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CoffeeBeanMetarial

interface GrindBehavior {
    fun grindBean(bean: CoffeeBeanMetarial)
}