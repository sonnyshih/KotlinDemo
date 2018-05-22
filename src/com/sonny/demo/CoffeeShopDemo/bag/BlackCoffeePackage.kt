package com.sonny.demo.CoffeeShopDemo.bag

import com.sonny.demo.CoffeeShopDemo.bag.material.bean.BlackCoffeeBean
import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CoffeeBeanMetarial
import com.sonny.demo.CoffeeShopDemo.bag.material.sugar.CubeSugar
import com.sonny.demo.CoffeeShopDemo.bag.material.sugar.SugarMaterial

class BlackCoffeePackage: CoffeePackage() {

    private var sugar: SugarMaterial

    init {
        coffeeBean = BlackCoffeeBean()
        sugar = CubeSugar()
    }

    override fun showMaterial() {
        println(coffeeBean.showCoffeeName())
        println(sugar.getSugarName())
    }

    override fun getCoffee(): CoffeeBeanMetarial {
        return coffeeBean
    }

    fun getSugar(): SugarMaterial {
        return sugar
    }
}