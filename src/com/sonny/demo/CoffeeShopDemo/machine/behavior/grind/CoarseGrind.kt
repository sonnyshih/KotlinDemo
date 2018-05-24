package com.sonny.demo.CoffeeShopDemo.machine.behavior.grind

import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CoffeeBeanMetarial

class CoarseGrind: GrindBehavior {
    override fun grindBean(bean: CoffeeBeanMetarial) {
        println("GrindBehavior "+ bean.getCoffeeName() +" to coarse size ")
        for(i in 1..10){
            Thread.sleep(500)
            print(".")
        }
    }


}