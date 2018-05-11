package com.sonny.demo.basic.classes

import com.sonny.demo.basic.classes.Person;

class Employee(name: String): Person(name) {
	
    // 一個可以改變值的屬性（property）
    var salary: Double = 0.0

	// 其它建構式，使用this(name)呼叫主要建構式
    constructor(name: String, gender: Char, salary: Double): this(name) {
        // 設定繼承自父類別的屬性值
        super.gender = gender
    
		// 設定屬性值
        this.salary = salary
    }
 
    // 覆寫繼承自父類別的函式
    override fun printInformation() {
        // 呼叫父類別的函式
        super.printInformation()
        println("Salary: $salary")
    }	
}