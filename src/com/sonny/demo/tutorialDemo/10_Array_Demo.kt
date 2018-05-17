package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {
    // 有三個元素的整數陣列
    val ia: IntArray = intArrayOf(3, 5, 7)

    // 合計變數
    var total: Int = 0

    // 依序處理所有陣列元素的迴圈
    // 執行過程會自動把每一個陣列的元素指定給變數n
    for (n in ia) {
        total += n
    }

    // 顯示： Total: 15
    println("Total: $total")

    showArrayDemo();

    ShowTotalAndAvargeDemo();

    showStringArray();

    showInitStringArray();
}

fun showArrayDemo(){
    /*  整數、小數、字元或邏輯資料，可以使用下面的型態宣告陣列變數：
        ByteArray, ShortArray, IntArray: default為0
        LongArray: default為0L
        FloatArray: default為0.0F
        DoubleArray: default為0.0
        CharArray: default 編碼為0的字元
        BooleanArray: default 為false
    */

    // 宣告與建立有三個元素的Int陣列
    val ages: IntArray = IntArray(3)

    // 設定元素值，第一個元素的編號是0
    ages[0] = 35
    ages[1] = 12
    ages[2] = 27

    println(" /* ##### 迴圈處理陣列元素 ##### */");
    // 使用for迴圈依序處理陣列所有元素
    // 迴圈執行的次數就是元素個數
    // 每執行一次都會把元素值指定給element變數
    for (element in ages) {
        println(element)
    }


    println(" /* ##### 根據陣列的元素個數傳回範圍運算式 ##### */");
    // 陣列.indices：根據陣列的元素個數傳回範圍運算式
    // ages.indices傳回0..2
    for (i in ages.indices) {
        println("[$i]: ${ages[i]}")
    }


    println(" /* ##### 傳回元素編號與元素值成對的資料 ##### */");
    // 陣列.withIndex()：傳回元素編號與元素值成對的資料
    // 搭配for迴圈使用這樣的語法：
    // for ( (元素編號變數, 元素值變數) in 陣列.withIndex() ) ...
    for ((i, v) in ages.withIndex()) {
        println("[$i]: $v")
    }
}

fun ShowTotalAndAvargeDemo(){

    println(" /* ##### 執行資料合計與平均 ##### */");

    // 宣告與建立有三個元素的Int陣列
    val ages: IntArray = IntArray(3)
//    val ages = intArrayOf(35, 17, 24)

    // 設定元素值，第一個元素的編號是0
    ages[0] = 35
    ages[1] = 17
    ages[2] = 24

    // 宣告合計用的變數
    var total = 0

    // 使用迴圈執行所有元素的合計
    for (age in ages) {
        total += age
    }

    // 陣列.size：陣列的元素個數
    // 計算平均
    val average = total / ages.size

    println("Total: $total, Average: $average")
    // 顯示： Total: 76, Average: 25
}

fun showStringArray() {
    println(" /* ##### 處理字串Array ##### */");

    // 宣告與建立有三個元素的String陣列
    val names: Array<String?> = arrayOfNulls<String>(3)

    // 可以省略型態
    //val names = arrayOfNulls<String>(3)
    // 如果要使用型態，就可以省略arrayOfNulls後面的<String>
    //val names: Array<String?> = arrayOfNulls(3)

    // 設定元素值，第一個元素的編號是0
    names[0] = "Simon"
    names[1] = "Mary"
    names[2] = "Sam"

    // 使用for迴圈依序處理陣列所有元素
    // 迴圈執行的次數就是元素個數
    // 每執行一次都會把元素值指定給element變數
    for (element in names) {
        println(element)
    }

    // 顯示：
    // Simon
    // Mary
    // Sam

    println()

    // 陣列.indices：根據陣列的元素個數傳回範圍運算式
    // ages.indices傳回0..2
    for (i in names.indices) {
        println("[$i]: ${names[i]}")
    }

    // 顯示：
    // [0]: Simon
    // [1]: Mary
    // [2]: Sam

    println()

    // 陣列.withIndex()：傳回元素編號與元素值成對的資料
    // 搭配for迴圈使用這樣的語法：
    // for ( (元素編號變數, 元素值變數) in 陣列.withIndex() ) ...
    for ((i, v) in names.withIndex()) {
        println("[$i]: $v")
    }

    // 顯示：
    // [0]: Simon
    // [1]: Mary
    // [2]: Sam
}

fun showInitStringArray() {
    println(" /* ##### 處理初始化字串Array ##### */");

    // 宣告與建立有三個元素的String陣列
    val names = arrayOf("Simon", "Mary", "Sam")

    for (element in names) {
        println("Hello!, ${element.toUpperCase()}!")
    }

    // 顯示：
    // Hello!, SIMON!
    // Hello!, MARY!
    // Hello!, SAM!

}