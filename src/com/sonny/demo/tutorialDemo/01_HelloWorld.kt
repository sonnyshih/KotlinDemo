package com.sonny.demo.tutorialDemo

fun main(args: Array<String>){

    println("Enter a world");
    var firstWord = readLine();

    println("Enter another world");
    var secondWord = readLine();

    println(firstWord + " " + secondWord);

    println("Enter a number");
    var firstNumber = readLine()!!;

    println("Enter another number");
    var secondNumber = readLine()!!;

    println(firstNumber.toInt() + secondNumber.toInt());

    // 在字串裡面使用「${數字、計算或其它資料}」
    // Kotlin依照「${」和「}」之間的內容，執行計算與替換
    println("I am ${35 * 12} months old.");


}