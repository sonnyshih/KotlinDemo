package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {
    // 顯示： 12345
    for (index: Int in 1..5) {
        print(index)
    }

    println()

    // 顯示：1234
    for (i in 1 until 5) {
        print(i)
    }

    println()

    // 顯示： 135
    for (index: Int in 1..5 step 2)
        print(index)

    println()

    // 顯示： 54321
    for (index: Int in 5 downTo 1)
        print(index)

    println()

    // 顯示：531
    for (i in 5 downTo 1 step 2) {
        print(i)
    }

    println()

    for (c in 'A'..'E')
        print(c)

    // 顯示：ABCDE
}