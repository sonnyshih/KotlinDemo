package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {

    println("/* ##### 宣告沒有參數、沒有回傳值的函式 ##### */")
    hello()
    // 顯示： Hello! Kotlin!

    hello01()
    // 顯示： Hello! Kotlin!

    println()
    println("/* ##### 宣告沒有參數、回傳值為String的函式 ##### */")
    println( getGreeting() )
    // 顯示： Hello! Kotlin!

    val greet = getGreeting()
    println(greet)
    // 顯示： Hello! Kotlin!

    println()
    println("/* ##### 如果函式的程式碼只有一行return敘述 ##### */")
    println( getHello01() )
    // 顯示： Hello! Kotlin!

    println( getHello02() )
    // 顯示： Hello! Kotlin!

    println()
    println("/* ##### 宣告接收一個String參數、沒有回傳值的函式 ##### */")
    // 依照函式參數的定義，在呼叫的時候提供一個字串資料給函式使用
    sayHello("Simon")
    // 顯示： Hello! Simon!

    println()
    println("/* ##### 宣告接收三個參數、沒有回傳值的函式 ##### */")
    // 呼叫的時候，依照函式參數的宣告，依序提供資料給函式使用
    person01("Simon", 35, true)
    // 顯示： Name: Simon, Age: 35, Married: Yes

    println()
    println("/* ##### 呼叫函式的時候提供兩個整數，所以會呼叫兩個Int參數的函式 ##### */")
    println("max(3, 5) = ${max(3, 5)}")
    // 顯示： max(3, 5) = 5

    println()
    println("/* ##### 呼叫函式的時候提供兩個小數，所以會呼叫兩個Double參數的函式 ##### */")
    println("max(3.2, 5.6) = ${max(3.2, 5.6)}")
    // 顯示： max(3.2, 5.6) = 5.6

    println()
    println("/* ##### 呼叫函式的時候，可以省略設定預設值的參數 ##### */")
    person03("Mary")
    // 顯示： Name: Mary, Age: 0, Married: No
    // age與married使用參數設定的預設值

    person03("Mary", 3)
    // 顯示： Name: Mary, Age: 3, Married: No
    // married使用參數設定的預設值

    person03("Mary", 32, true)
    // 顯示： Name: Mary, Age: 32, Married: Yes

    println()
    println("/* ##### 呼叫函式的時候，可以使用參數名稱設定傳遞的值 ##### */")
    println("/* ##### 就不用依照函式宣告參數的順序傳遞 ##### */")
    person03("John", married = true, age = 24)
    // 顯示： Name: John, Age: 24, Married: Yes

    person03("John", married = true)
    // 顯示： Name: John, Age: 0, Married: Yes

    println()
    println("/* ##### 使用vararg設定參數可以接收零到多個值 ##### */")
    println( average(1, 2, 3) )
    println( average(1, 2, 3, 4, 5, 6) )

}

// 宣告沒有參數、沒有回傳值的函式
fun hello(): Unit {
    println("Hello! Kotlin!")
}

// 宣告沒有回傳值的函式，可以省略「:Unit」
fun hello01() {
    println("Hello! Kotlin!")
}

// 宣告沒有參數、回傳值為String的函式
fun getGreeting(): String {
    return "Hello! Kotlin!"
}

// 如果函式的程式碼只有一行return敘述
// 可以使用單一運算式函式（Single-Expression functions）的寫法
fun getHello01(): String = "Hello! Kotlin!"

// 單一運算式函式可以省略函式回傳值型態的宣告
fun getHello02() = "Hello! Kotlin!"


// 宣告接收一個String參數、沒有回傳值的函式
fun sayHello(name: String) {
    println("Hello! $name!")
}

// 宣告接收三個參數、沒有回傳值的函式
fun person01(name: String, age: Int, married: Boolean) {
    println("Name: $name, Age: $age, Married: ${if (married) "Yes" else "No"}")
}

// 接收兩個整數參數，傳回比較大的數字
fun max(x: Int, y: Int) = if (x > y) x else y
// 接收兩個小數參數，傳回比較大的數字
fun max(x: Double, y: Double) = if (x > y) x else y


// 在參數宣告後面設定參數的預設值
fun person03(name: String, age: Int = 0, married: Boolean = false) {
    println("Name: $name, Age: $age, Married: ${if (married) "Yes" else "No"}")
}


// 使用vararg設定參數可以接收零到多個值
// 呼叫這個函式可以在傳遞零到多個整數
// 參數的資料型態為陣列
fun average(vararg ns: Int): Int {
    var total = 0

    // 使用迴圈處理陣列的所有元素（合計）
    for (n in ns) {
        total += n
    }

    // 傳回平均值
    return total / ns.size
}