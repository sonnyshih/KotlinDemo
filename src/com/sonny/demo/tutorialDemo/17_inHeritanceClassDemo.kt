package com.sonny.demo.tutorialDemo


fun main(args: Array<String>) {

    Demo1()

    println()
    Demo2()
}

fun Demo1(){
    println("/* ##### 使用繼承設計的類別 ##### */")
    val i = MainItem(1, "Hello", "Hello Kotlin!")
    println("MainItem 物件: id=${i.id}, title=${i.title}, content=${i.content}")

    // 建立ImageItem物件後，包含從父類別Item繼承的id、title與content
    val i02 = ImageItem(2, "Hi", "Hello", "kotlin.jpg")
    println("ImageItem 物件: id=${i02.id}, title=${i02.title}, " +
            "content=${i02.content}, imageFile=${i02.imageFile}")
}

fun Demo2(){
    println("/* ##### 函式覆寫 ##### */")

    val i = MainItem(1, "Hello", "Hello Kotlin!")

    // 顯示呼叫函式傳回的項目資訊
    println(i.getDetails())

    // 顯示簡短的記事內容（預設為五個字）
    println(i.getReduceContent())

    val i02 = ImageItem(2, "Hi", "Good morning", "kotlin.jpg")

    // 顯示呼叫函式傳回的項目資訊，這是ImageItem自己寫的函式
    println(i02.getDetails())

    // 顯示四個字的簡短記事內容，這是繼承自父類別Item的函式
    println(i02.getReduceContent(4))
}

// 在宣告項目類別的時候，使用open關鍵字讓它可以被繼承
open class MainItem (val id: Long,
                 var title: String,
                 var content: String) {

    // 傳回簡短的記事內容
    // 因為不需要讓子類別覆寫，所有不需要加入open關鍵字
    fun getReduceContent(length: Int = 5) =
            "${content.substring(0 until length)}..."

    // 加入open關鍵字讓子類別可以覆寫這個函式
    // 因為子類別需要加入額外的資訊，例如ImageItem的imgaeFile
    open fun getDetails() = "id=$id, title=$title, content=$content"
}


// 在宣告主要建構式的時候
//   從父類別繼承的id、title與content屬性
//   不使用val或var宣告，所以它們只是參數
//   另外使用var宣告ImageItem需要的imageFile屬性
// 在類別宣告的最後面
//   使用Item(id, title, content)呼叫父類別Item的主要建構式
//   設定編號、標題與內容
class ImageItem(id: Long,
                title: String,
                content: String,
                var imageFile: String): MainItem(id, title, content) {


    // 不用覆寫繼承自父類別的getReduceContent函式

    // 加入override關鍵字覆寫父類別的函式
    //   顯示繼承自父類別的id、title與content
    //   還有自己宣告的imageFile
    override fun getDetails() = "id=$id, title=$title, " +
            "content=$content, imageFile=$imageFile"
}