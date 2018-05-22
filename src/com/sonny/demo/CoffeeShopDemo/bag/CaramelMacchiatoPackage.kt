package com.sonny.demo.CoffeeShopDemo.bag

import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CaramelMacchiatoCoffeeBean
import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CoffeeBeanMetarial
import com.sonny.demo.CoffeeShopDemo.bag.material.milk.MilkMetarial
import com.sonny.demo.CoffeeShopDemo.bag.material.milk.NormalMilk
import com.sonny.demo.CoffeeShopDemo.bag.material.sugar.CaramelSugar
import com.sonny.demo.CoffeeShopDemo.bag.material.sugar.SugarMaterial

class CaramelMacchiatoPackage: CoffeePackage(){

    private var sugar: SugarMaterial
    private var milk: MilkMetarial

    init {
        coffeeBean = CaramelMacchiatoCoffeeBean()
        sugar = CaramelSugar()
        milk = NormalMilk()
    }

    override fun showMaterial() {
        println(coffeeBean.getCoffeeName())
        println(milk.getMilkName())
        println(sugar.getSugarName())
    }

    override fun getCoffee(): CoffeeBeanMetarial {
        return coffeeBean
    }

    fun getSugar():SugarMaterial{
        return sugar
    }

    fun getMilk():MilkMetarial{
        return milk
    }

}