package com.sonny.demo.CoffeeShopDemo.bag

import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CoffeeBeanMetarial

abstract class CoffeePackage{

    protected lateinit var coffeeBean: CoffeeBeanMetarial

    protected abstract fun showMaterial()

    abstract fun getCoffee(): CoffeeBeanMetarial

}