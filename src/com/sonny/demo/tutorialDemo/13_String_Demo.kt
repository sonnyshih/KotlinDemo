package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {

    showStringCompareAndJudge();

    showStringLengthAndCharAndSearch()

    showStringCaseTrasfer()

    showStringTransateToInt()
}

fun showStringCompareAndJudge(){
    println("/* ##### 字串比較與判斷 ##### */")
    val name: String = "simon"
    val name2 = "SIMON"

// 判斷兩個字串是否一樣
    println("name.equals(name2): ${name.equals(name2)}")
// 判斷兩個字串是否一樣，不分大小寫
    println("name.equals(name2): ${name.equals(name2, true)}")

    val URL = "http://www.CODEDATA.com.tw"

// 判斷字串前面是否為指定的內容
    println("URL.startsWith(\"http\"): ${URL.startsWith("http")}")
// 判斷字串後面是否為指定的內容
    println("URL.endsWith(\"tw\"): ${URL.endsWith("tw")}")

// 判斷字串內容是否為空白
    println("URL.isBlank(): ${URL.isBlank()}")
    println("URL.isNotBlank(): ${URL.isNotBlank()}")
// 判斷是否沒有字元
    println("URL.isEmpty(): ${URL.isEmpty()}")
    println("URL.isNotEmpty(): ${URL.isNotEmpty()}")
}

fun showStringLengthAndCharAndSearch(){
    println("/* ##### 長度、字元與搜尋 ##### */")

    val name: String = "simon"

// 傳回字元編號的範圍運算式
    for (i in name.indices) {
        // 取得指定編號的字元
        print("${name.get(i)}\t")
    }

    println()

// 使用for迴圈依序處理所有字元
    for (c in name) {
        print("$c\t")
    }

    println()

// 第一個與最後一個字元
    println("name.first(): ${name.first()}")
    println("name.last(): ${name.last()}")

// 字元個數
    println("name.length: ${name.length}")
// 最後一個字元的編號
    println("name.lastIndex: ${name.lastIndex}")

    val URL = "http://www.CODEDATA.com.tw"

// 從字串前面往後搜尋，傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.indexOf(\"w\"): ${URL.indexOf("w")}")
// 從字串後面往前搜尋，傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.lastIndexOf(\"w\"): ${URL.lastIndexOf("w")}")

// 傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.indexOf(\"codedata\"): ${URL.indexOf("codedata")}")
// 傳回指定內容的位置編號，沒有的話傳回-1，不分大小寫
    println("URL.indexOf(\"codedata\", 0, true): ${URL.indexOf("codedata", 0, true)}")
}

fun showStringCaseTrasfer() {
    println("/* ##### 字串轉換 ##### */")
    val name: String = "simon"

// 把第一個字元轉換為大寫
    println("name.capitalize(): ${name.capitalize()}")
// 把第一個字元轉換為小寫
    println("name.decapitalize(): ${name.decapitalize()}")

    val URL = "http://www.CODEDATA.com.tw"

// 轉換為小寫
    println("URL.toLowerCase(): ${URL.toLowerCase()}")
// 轉換為大寫
    println("URL.toUpperCase(): ${URL.toUpperCase()}")
}

fun showStringTransateToInt(){
    println("/* ##### 字串轉換數字 ##### */")

    val intString = "35"
    val doubleString = "72.5"
    val booleanString = "true"

    // 轉換字串為Int
    val iv = intString.toInt()
    println("字串:" )

    // 轉換字串為Double
    val dv = doubleString.toDouble()
    // 轉換字串為Boolean
    val bv = booleanString.toBoolean()

    val intString2 = "Hello"
    // 字串內容不是整數，執行以後會發生錯誤
    // Exception in thread "main" java.lang.NumberFormatException:
    //     For input string: "Hello"
    //val iv2 = intString2.toInt()

    val name: String = "simon"

// 轉換為字元陣列
    val ns = name.toCharArray()

    for (c in ns) {
        print(c)
    }

    println()

    val ns2 = charArrayOf('x', 'x', 'x', 'x', 'x')

// 轉換為字元陣列，參數依照順序為：
//    儲存轉換結果的字元陣列
//    字元陣列的起始編號
//    字串的字元起始編號
//    字串的字元結束編號
// 轉換的字串的範圍從起始編號開始，字元個數為結束編號減起始編號
    name.toCharArray(ns2, 0, 0, 3)

    for (c in ns2) {
        print(c)
    }
}