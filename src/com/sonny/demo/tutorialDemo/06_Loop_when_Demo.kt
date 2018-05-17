package com.sonny.demo.tutorialDemo

//如同 java switch的功能

fun main(args: Array<String>) {
    val grade = 'B'
    val bonus: Int

    when (grade) {
        'A'     -> bonus = 5000
        'B'     -> bonus = 3000
        'C'     -> bonus = 1000
        else    -> bonus = 50       //如同 java switch 的default
    }

    // 顯示： Bonus: 3000
    println("Bonus: $bonus")

    // 上面寫法的簡寫
    val bonus2 =
            when (grade) {
                'A'     -> 5000
                'B'     -> 3000
                'C'     -> 1000
                else    -> 50
            }

    // 顯示： Bonus: 3000
    println("Bonus2: $bonus2")
}