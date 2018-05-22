package com.sonny.demo.CoffeeShopDemo.bag.material.bean

class LatteCoffeeBean: CoffeeBeanMetarial{

    private var name = "Latte Coffee Bean"

    override fun showCoffeeName() {
        println(name)
    }

    override fun getCoffeeName(): String {
        return name;
    }

}