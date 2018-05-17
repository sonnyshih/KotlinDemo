package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {
    val x: Int = 3  // 使用val宣告不可改變的變數
    val y = 5       // 使用設定值推論變數型態
    val z: Int      // 沒有設定值的變數就一定要指定型態
    z = 7           // 設定值以後就不可以改變

    println("X: " + x)
    // 也可寫成
    // println("X: $x");

    println("Y: " + y)
    println("Z: " + z)


    var v: Int = 3          // 使用var宣告可以改變的變數
    v = 13                  // 不會發生錯誤
    println("V: " + v)

}