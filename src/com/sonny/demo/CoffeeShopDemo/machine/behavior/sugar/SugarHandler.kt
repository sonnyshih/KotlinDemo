package com.sonny.demo.CoffeeShopDemo.machine.behavior.sugar

import com.sonny.demo.CoffeeShopDemo.bag.material.sugar.SugarMaterial

class SugarHandler: SugarBehavior {
    override fun addSugar(sugar: SugarMaterial) {

        println("Add the " + sugar.getSugarName())
    }


}