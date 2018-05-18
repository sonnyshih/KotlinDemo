package com.sonny.demo.tutorialDemo

fun main(args: Array<String>) {

    classDemo1()

    println()
    classDemo2()

    println()
    classDemo3()

    println()
    classArrayDemo()

    println()
    classGetAndSetDemo()
}

fun classDemo1(){
    println("/* ##### 宣告建立Item01物件，依照主要建構式的順序提供參數 ##### */")
    // 宣告建立Item01物件，依照主要建構式的順序提供參數
    val item01 = Item01(1, "Hello", "Hello Kotlin!")
    println("Item01(id=${item01.id}, title=${item01.title}, content=${item01.content})")
    // 顯示： Item01(id=1, title=Hello, content=Hello Kotlin!)

    // 編譯錯誤，使用val宣告的屬性不可以修改
    // item01.id = 11

    // 設定title與content
    item01.title = "Hello01"
    item01.content = "Hello Kotlin 01!"

    println("Item01(id=${item01.id}, title=${item01.title}, content=${item01.content})")
    // 顯示： Item01(id=1, title=Hello01, content=Hello Kotlin 01!)
}

fun classDemo2(){

    println("/* ##### 宣告建立Item02物件，依照不同的需求設定屬性值 ##### */")
    // 省略設定預設值的建構式參數title與content
    val item0201 = Item02(201)
    println(item0201.getDetails())
    // 顯示： Item02(id=201, title=, content=)

    // 省略設定預設值的建構式參數content
    val item0202 = Item02(202, "Hi")
    println(item0202.getDetails())
    // 顯示： Item02(id=202, title=Hi, content=)

    val item0203 = Item02(203, "Hi", "Hello")
    println(item0203.getDetails())
    // 顯示： Item02(id=203, title=Hi, content=Hello)
}


fun classDemo3(){
    println("/* ##### 根據提供的參數設定物件的 屬性值， ##### */")
    println("/* ##### 如果需要檢查參數的正確性，或是根據屬性的應用執行額外的處理， ##### */")
    println("/* ##### 可以在類別加入初始化區塊執行這類工作 ##### */")
    val item0303 = Item03(303, "Hi", "Hello")
    println(item0303.getDetails())
    // 顯示： Item02(id=203, title=Hi, content=Hello)

    val item0304 = Item03(304, "", "")
    println(item0304.getDetails())
    // 顯示： Item02(id=204, title=Title required, content=Content required)
}

fun classArrayDemo(){
    println("/* ##### 建立與使用物件陣列 ##### */")

    val items = arrayOf(
            Item02(2001),
            Item02(2002),
            Item02(2003)
    )

    // 使用迴圈處理陣列裡面的所有Item02物件
    for (item in items) {
        // 顯示Item02物件資訊
        println(item.getDetails())
    }
    // 顯示：
    // Item02(id=2001, title=, content=)
    // Item02(id=2002, title=, content=)
    // Item02(id=2003, title=, content=)

    println()

    for (item in items) {
        // 設定每一個元素Item02物件的title與content屬性
        item.title = "Hi"
        item.content = "Hello"
    }

    for (item in items) {
        println(item.getDetails())
    }
    // 顯示：
    // Item02(id=2001, title=Hi, content=Hello)
    // Item02(id=2002, title=Hi, content=Hello)
    // Item02(id=2003, title=Hi, content=Hello)
}

fun classDemo4(){
    println("/* ##### 宣告屬性 ##### */")

    val item04 = Item04(4, "Greeting", "Good morning")
    println(item04.getDetails())
    // 顯示： Item04(id=4, title=Greeting, content=Good morning)
}

fun classGetAndSetDemo(){
    println("/* ##### 自動轉換為呼叫setter與getter函式 ##### */")
    val item = Item(100)
    // 呼叫setId函式設定屬性值
    item.id = 101

    // 呼叫getId函式取得屬性值
    println(item.id)

    println()
    println("/* ##### 為屬性宣告自定的setter與getter函式 ##### */")
    val item05 = Item05(5, "Nice day")
    println(item05.getDetails())
    // 顯示： Item05(id=5, title=Nice day, content=Empty)

    item05.title = ""
    println("title=${item05.title}")
    // 顯示： title=Nice day

    item05.content = ""
    println("content=${item05.content}")
    // 顯示： content=Empty

    //
    item05.content = "Nice day"
    println("content=${item05.content}")
    // 顯示： content=Nice day

}

class Item(var id: Int)

// 宣告包含id（編號）、title（標題）與content（內容）三個屬性的類別
// 為類別宣告主要建構式的參數，也同時宣告這個類別的屬性
class Item01 constructor (val id: Long,
                          var title: String,
                          var content: String)



// 宣告包含id（編號）、title（標題）與content（內容）三個屬性的類別
// 主要建構式的constructor關鍵字可以省略
// 為title與content兩個欄位設定預設值
class Item02 (val id: Long = 0,
              var title: String = "",
              var content: String = "") {

    // 宣告傳回資訊的函式
    fun getDetails() = "Item02(id=$id, title=$title, content=$content)"
}


// 宣告包含id（編號）、title（標題）與content（內容）三個屬性的類別
// 主要建構式的constructor關鍵字可以省略
// 為title與content兩個欄位設定預設值
class Item03 (val id: Long = 0,
              var title: String = "",
              var content: String = "") {

    // 初始化，可以在這裡檢查與處理屬性值
    init {
        title = if (title.isEmpty()) "Title required" else title
        content = if (content.isEmpty()) "Content required" else content
    }

    // 宣告傳回資訊的函式
    fun getDetails() = "Item02(id=$id, title=$title, content=$content)"
}

// 宣告包含id（編號）、title（標題）與content（內容）三個參數的建構式
// 因為宣告建構式參數沒有使用val或var，所以它們只是建構式的參數，並不是類別的屬性
class Item04(_id: Long,
             _title: String,
             _content: String) {

    // 宣告類別的屬性，並設定為建構式的參數
    val id = _id
    var title = _title
    var content = _content

    fun getDetails() = "Item03(id=$id, title=$title, content=$content)"
}

// 類別宣告屬性，使用set與get關鍵字，為屬性宣告自定的setter與getter函式
class Item05(val id: Long,
             _title: String,
             _content: String = "") {

    var title = _title
    // 宣告屬性的setter函式
        set(value: String) {
            if (value.isNotEmpty()) {
                // 使用field關鍵字取代屬性名稱title
                field = value
            }
        }

    var content = _content
    // 宣告屬性的getter函式
        get() {
            // 使用field關鍵字取代屬性名稱content
            return if (field.isEmpty()) "Empty" else field
        }

    fun getDetails() = "Item05(id=$id, title=$title, content=$content)"
}