package com.sonny.demo.tutorialDemo

// 宣告顏色列舉型態，包含六個顏色成員
private enum class Colors01 {
    // 列出所有成員的名稱，有六種顏色的名稱，每一個名稱之間使用逗號隔開
    LIGHTGREY, BLUE, PURPLE,
    GREEN, ORANGE, RED
}

// 如果列舉型態需要包含每一個成員對應的資料，
//   在宣告的時候加入成員對應資料的參數
private enum class Colors02(val value: Int) {
    // 在每一個成員名稱後的左右刮號裡面填入對應的資料
    LIGHTGREY(0XD3D3D3), BLUE(0X33B5E5), PURPLE(0XAA66CC),
    GREEN(0X99CC00), ORANGE(0XFFBB33), RED(0XFF4444)
}

fun main(args: Array<String>) {

    println("/* ##### Demo1: 列舉類別型態的變數，只能指定在類別中宣告好的成員名稱 ##### */")
    colorDemo1()

    println();
    println("/* ##### Demo2: 會自動為列舉類別加入一些函式，例如把字串轉換為列舉類別型態，" +
            "可以呼叫Kotlin自動加入的valueOf函式 ##### */")
    colorDemo2()

    println();
    println("/* ##### Demo3: 它可以傳回所有宣告在這個列舉類別型態裡面的成員，" +
            "                型態是列舉類別陣列。每一個列舉類別成員有Kotlin自動加入的ordinal與name兩個屬性，" +
            "                分別是成員的索引編號(Int)和名稱(String) ##### */")
    colorDemo3()

    println();
    println("/* ##### Demo4: 判斷顏色代碼 ##### */")
    colorDemo4()

    println();
    println("/* ##### Demo5: 額外加入接收顏色代碼參數的主要建構式，再把每一個顏色對應的代碼設定在成員後面 ##### */")
    colorDemo5()

}

private fun colorDemo1(){

    // 宣告紅、藍、綠三個顏色變數
    val c01: Colors01 = Colors01.RED
    val c02: Colors01 = Colors01.BLUE
    val c03: Colors01 = Colors01.GREEN

    println("$c01, $c02, $c03")
// 顯示： RED, BLUE, GREEN
}

private fun colorDemo2(){
    // 把紅、藍、綠顏色名稱字串轉換為列舉型態變數
    val c04: Colors01 = Colors01.valueOf("RED")
    val c05: Colors01 = Colors01.valueOf("BLUE")
    val c06: Colors01 = Colors01.valueOf("GREEN")

    println("$c04, $c05, $c06")
// 顯示： RED, BLUE, GREEN
}

private fun colorDemo3(){
    // 取得包含列舉型態所有成員的陣列
    val cs: Array<Colors01> = Colors01.values()

    for (c in cs) {
        println("${c.ordinal}: ${c.name}")
    }
// 顯示：
//    0: LIGHTGREY
//    1: BLUE
//    2: PURPLE
//    3: GREEN
//    4: ORANGE
//    5: RED
}

private fun colorDemo4(){
    val c01: Colors01 = Colors01.RED
    val c02: Colors01 = Colors01.BLUE
    val c03: Colors01 = Colors01.GREEN

// toString(16)可以把整數轉換為16進位字串
    println("$c01: ${getColorCode(c01)}, ${getColorCode(c01).toString(16)}")
    println("$c01: ${getColorCode(c02)}, ${getColorCode(c02).toString(16)}")
    println("$c01: ${getColorCode(c03)}, ${getColorCode(c03).toString(16)}")
// 顯示：
//    RED: 16729156, ff4444
//    RED: 3388901, 33b5e5
//    RED: 10079232, 99cc00
}

// 傳回參數的顏色代碼
private fun getColorCode(color: Colors01) =
// 判斷顏色並傳回對應的代碼
        when (color) {
            Colors01.LIGHTGREY -> 0XD3D3D3
            Colors01.BLUE -> 0X33B5E5
            Colors01.PURPLE -> 0XAA66CC
            Colors01.GREEN -> 0X99CC00
            Colors01.ORANGE -> 0XFFBB33
            Colors01.RED -> 0XFF4444
        }


private fun colorDemo5(){
    val c01 = Colors02.RED
    val c02 = Colors02.BLUE
    val c03 = Colors02.GREEN

// 列舉型態變數多了建構式參數指定的屬性
    println("$c01: ${c01.value}")
    println("$c02: ${c02.value}")
    println("$c03: ${c03.value}")
// 顯示：
//    RED: 16729156
//    BLUE: 3388901
//    GREEN: 10079232
}