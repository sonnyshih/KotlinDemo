package com.sonny.demo.CoffeeShopDemo.bag.material.bean

class BlackCoffeeBean(): CoffeeBeanMetarial {

    private var name = "Black Coffee Bean"

    override fun showCoffeeName() {
        println(name);
    }

    override fun getCoffeeName(): String {
        return name;
    }
}