package com.sonny.demo.CoffeeShopDemo.machine.behavior.grind

import com.sonny.demo.CoffeeShopDemo.bag.material.bean.CoffeeBeanMetarial

class CoarseGrind: GrindBehavior {
    override fun grindBean(bean: CoffeeBeanMetarial) {
        println("GrindBehavior "+ bean.getCoffeeName() +" to coarse size ....")
    }


}