package com.sonny.demo.CoffeeShopDemo.bag

import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CoffeeBeanMetarial
import com.sonny.demo.CoffeeShopDemo.bag.material.bean.LatteCoffeeBean
import com.sonny.demo.CoffeeShopDemo.bag.material.milk.MilkMetarial
import com.sonny.demo.CoffeeShopDemo.bag.material.milk.NormalMilk

class LatteCoffeePackage: CoffeePackage() {

    private var milk: MilkMetarial

    init {
        coffeeBean = LatteCoffeeBean()
        milk = NormalMilk()
    }

    override fun showMaterial() {
        println(coffeeBean.getCoffeeName())
        println(milk.getMilkName())
    }

    override fun getCoffee(): CoffeeBeanMetarial {
        return coffeeBean
    }

    fun getMilk(): MilkMetarial {
        return milk
    }

}