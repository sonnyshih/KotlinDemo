package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {
    /*
        Kotlin為了預防null造成的問題，
           而且簡化應用程式的設計，在宣告物件變數的時候，
           預設的作法是不允許指定null值給物件變數

    */

    defineNullObjectDemo();

    avoidNullDemo();

    judgeVariableIsNullDemo();

    asignNullToArrayDemo();
}

fun defineNullObjectDemo(){
    /*
    * 如果因為特殊的需求，或是為了跟Java應用程式的相容性，
    *       你也可在宣告物變數的時候，讓它可以指定null值。
    * */
    // 宣告可以指定null值的變數
    var name2: String? = "Mary"

    // 可以指定null值
    name2 = null

    // 編譯錯誤，因為可以指定null值的變數
    // 不允許直接呼叫函式
    // println(name2.length)

    // 如果先經過null值的判斷...
    if (name2 != null) {
        // 就可以直接使用
        println(name2.length)
    }

}

fun avoidNullDemo(){

    // 宣告可以指定null值的變數
    var name2: String? = "Mary"
    println("name2 非 NULL時 長度:" + name2?.length);


    // 必須在變數名稱後面多一個問號
    // 變數是null值的時候，不會發生例外，不過會傳回null
    name2 = null;
    println("name2 是 NULL時 長度:" + name2?.length);

    name2 = "Sam"
    // 變數不是null值的時候，顯示呼叫函式執行後的結果3
    println("name2 非 NULL時 長度:" + name2?.length)

    name2 = null
    // 在變數名稱後面加入兩個驚嘆號（!!）
    //println(name2!!.length)
    // 發生例外
    // Exception in thread "main" kotlin.KotlinNullPointerException
}

fun judgeVariableIsNullDemo(){
    var name: String? = null

    // 判斷變數是否為null或空白
    println("/* ##### 判斷變數是否為null或空白 ##### */")
    println("name.isNullOrBlank(): ${name.isNullOrBlank()}")

    // 判斷變數是否為null或沒有字元
    println("/* ##### 判斷變數是否為null或沒有字元 ##### */")
    println("name.isNullOrEmpty(): ${name.isNullOrEmpty()}")

    // 編譯錯誤，不可以直接呼叫
    //println("name.isBlank(): ${name.isBlank()}")
    //println("name.isEmpty(): ${name.isEmpty()}")

    println("name.isBlank(): ${name?.isBlank()}")
    println("name.isEmpty(): ${name?.isEmpty()}")
}

fun asignNullToArrayDemo(){
    // 變數與元素都不可以指定null值
//    var names3: Array<String> = arrayOf("One", "Two", "Three")

    // 變數不可以指定null值，但是元素可以
//    var names4: Array<String?> = arrayOf("One", "Two", "Three")

    // 變數與元素都可以指定null值
//    var names5: Array<String?>? = arrayOf("One", "Two", "Three")


    println("/* ##### 變數與元素都不可以指定null值 ##### */")
    // 變數與元素都不可以指定null值
    var names: Array<String> = arrayOf("Simon", "Mary", "Sam")

    // 編譯錯誤，變數不可以指定null值
    // names = null

    // 編譯錯誤，元素不可以指定null值
    // names[0] = null

    for (element in names) {
        print("${element.length}\t")
    }

    println();

    // 變數不可以指定null值，但是元素可以
    println("/* ##### 變數不可以指定null值，但是元素可以 ##### */")
    val names2: Array<String?> = arrayOf("Simon", "Mary", "Sam")
    // 元素可以指定null值
    names2[0] = null

    for (element in names2) {
        // 編譯錯誤，因為元素可以指定null值
        // print("${element.length}\t")
        print("${element?.length}\t")
    }

    println();

    // 變數與元素都指定null值
    println("/* ##### 變數與元素都指定null值 ##### */")
    var names3: Array<String?>? = arrayOf("Simon", "Mary", "Sam")

    names3!![0] = null;

    for (element in names3) {
        // 編譯錯誤，因為元素可以指定null值
        // print("${element.length}\t")
        print("${element?.length}\t")
    }

    println();

    names3 = null;

    println("Array內容個數: " + names3?.size)


}
