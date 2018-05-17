package com.sonny.demo.tutorialDemo

class Item01 constructor(var id: String, var name: String, var phone: String) {

    constructor(id: String): this(id, "沒有名字", "沒有電話"){
        println("第2個 constructor");
    }

    constructor(name: String, phone: String) : this("沒有id", name, phone) {
        println("第3個 constructor");
    }


    fun showItmeData(){
        println("id: $id ## name: $name ## phone: $phone");
    }
}

fun main (args: Array<String>){

    var item = Item01("100", "John", "0911123456");
    item.showItmeData();

    var item2 = Item01("300");
    item2.showItmeData();

    var item3 = Item01("Hello", "0922123999");
    item3.showItmeData();

}