package com.sonny.demo.basic.classes

/* ##### open 代表可以被繼承的class ##### */
// (var name: String)是一個字串參數的主要建構式（primary constructor）
open class Person (var name: String) {
	
	// 一個可以改變值的屬性（property）
	var gender: Char = 'U';
	
	val information: String
        // 為information加入getter方法
        get() = "$name(${if (gender=='M') "Male" else "Female"})";
	
	 // 其它建構式，使用this(name)呼叫主要建構式
    constructor(name: String, gender: Char) : this(name) {
        // 設定屬性
        this.gender = gender
    }
 
    // 函式
    fun sayGreeting() {
        println("Hello, $name!")
    }
 
    // 函式，使用open讓子類別可以覆寫這個方法
    open fun printInformation() {
        println("Name: $name")
        println("Gender: $gender")
    }
}