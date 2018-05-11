package com.sonny.demo;

import com.sonny.demo.basic.classes.Person;
import com.sonny.demo.basic.classes.Employee;

fun main(args: Array<String>) {
	val x: Int = 3;  // 使用val宣告不可改變的變數
	val y = 5;       // 使用設定值推論變數型態

	val z: Int;      // 沒有設定值的變數就一定要指定型態
	z = 7;           // 設定值以後就不可以改變

	println("/* ##### 不可改變變數 Start ##### */");
	println("X: " + x);
	println("Y: " + y);
	println("Z: " + z);
	println("/* ##### 不可改變變數 End ##### */");

	println();

	var v: Int = 3;          // 使用var宣告可以改變的變數
	v = 13;              // 不會發生錯誤

	println("/* ##### 可改變變數 Start ##### */");
	println("V: " + v);
	println("/* ##### 可改變變數 End ##### */");

	var greetString = getGreetString("Hello", "Simon");
	println(greetString);

	sayGreeting("Hello", "John");
	
	println("");
	
	// 使用when (如Java的Swith)
	whenDemo();
	println("");
	
	// 使用While
	WhileDemo();
	println("");
	
	// 使用 do while 
	doWhileDemo();
	
	// 使用 for
	forDemo();
	println("");

	
	/* ###### 使用Person Class (Start) ##### */
	val simon: Person = Person("Simon");
	
	// 呼叫函式，顯示： Hello, Simon!
    simon.sayGreeting()
	
    // 設定屬性值
    simon.gender = 'M';
    // 使用屬性值，顯示： Simon(Male)
    println(simon.information);

    /* ###### 使用Person Class (End) ##### */
 
    println();
	
	/* ###### 使用Employee Class (繼承Person class) (Start) ##### */
	var john : Employee = Employee("John", 'M', 25000.0);
    // 呼叫函式
    john.printInformation()
    // 執行後顯示：
    //      Name: Simon
    //      Gender: M
    //      Salary: 25000.0
	/* ###### 使用Employee Class (繼承Person class) (End) ##### */


}

fun getGreetString(greet: String, name: String): String {

	return greet + ", " + name + "!";
}

fun sayGreeting(greet: String, name: String) {
	println(greet + ", " + name + "!");
}

fun whenDemo(){
	
	println("##### when Demo (Start) #####");
	
	val grade = 'd';
    val bonus: Int;
	
	 when (grade) {
        'A'     ->
			bonus = 5000
        'B'     -> bonus = 3000
        'C'     -> bonus = 1000
        else    -> bonus = 50
    }
 
    // 顯示： Bonus: 3000
    println("Bonus: $bonus")
 
    val bonus2 =
            when (grade) {
                'A'     -> 5000
                'B'     -> 3000
                'C'     -> 1000
                else    -> 50
            }
 
    // 顯示： Bonus: 3000
    println("Bonus2: $bonus2");
	
	println("##### when Demo (End) #####");

}

fun WhileDemo(){
	
	println("##### while Demo (Start) #####");
	var index = 0
 
    while (index < 10) {
        print(index)
        index++
    }
	
	println("");
	println("##### while Demo (End) #####");
	
}

fun doWhileDemo(){
	
	println("##### do while Demo (Start) #####");
	
	var index = 0
 
    do {
        print(index)
        index++
    } while (index < 10)
    // 執行程式後顯示： 0123456789

	println("");
	println("##### do while Demo (End) #####");
}

fun forDemo(){
	
	println("##### for Demo 1 (Start) #####");
	// 顯示： 12345
    for (index: Int in 1..5) {
        print(index)
    }
 
    println();
	println("##### for Demo 1 (End) #####");
	println();
	
	println("##### for Demo 2 (Start) #####");
    // 顯示： 135
    for (index: Int in 1..5 step 2) {
        print(index)
	}
 
    println();
	println("##### for Demo 2 (End) #####");
 	println();
	
	println("##### for Demo 3 (Start) #####");
    // 顯示： 54321
    for (index: Int in 5 downTo 1) {
        print(index);
	}

	println();
	println("##### for Demo 3 (End) #####");
	
}







