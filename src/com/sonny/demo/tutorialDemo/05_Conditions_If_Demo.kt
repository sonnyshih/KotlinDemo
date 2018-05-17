package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {
    val x = 3
    val y = 5

    if (x > y) {
        println("x greater than y")

    } else if (x < y) {
        println("x less than y")
    }
    // 只有一行需要執行的敘述，可以省略大刮號
    else
        println("x equals y")
    // 執行程式後顯示： x less than y


    // 簡寫
    val v: Int
    v = if (x > y) x else y

    println(v);
}