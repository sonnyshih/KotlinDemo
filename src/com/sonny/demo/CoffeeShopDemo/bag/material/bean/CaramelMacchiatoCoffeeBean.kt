package com.sonny.demo.CoffeeShopDemo.bag.material.bean

class CaramelMacchiatoCoffeeBean(): CoffeeBeanMetarial {

    private var name = "Macchiato Coffee Bean"

    override fun showCoffeeName() {
        println(name);
    }

    override fun getCoffeeName(): String {
        return name;
    }
}