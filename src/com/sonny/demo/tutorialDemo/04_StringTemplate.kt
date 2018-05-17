package com.sonny.demo.tutorialDemo

//字串模板（string template）
fun main(args: Array<String>) {
    val x = 3
    val y = 5
    val z = 7

    // 替換變數內容以後的字串指定給變數s
    val s = "X: $x, Y: $y, Z: $z"
    println(s)

    // 顯示： summary: 3 + y + z
    println("summary: $x + y + z")

    // 顯示： summary: 15
    println("summary: ${x + y + z}")
}