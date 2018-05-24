package com.sonny.demo.tutorialDemo

class Singleton private constructor(){
    public var name:String = ""

    public var value:Singleton? = null;

    private object CreateInstance {
        val INSTANCE = Singleton()
    }

    companion object Factory {

        fun getInstance(): Singleton {
            return CreateInstance.INSTANCE
        }
    }

    fun showNameTest(){
        println(name);
    }
}

class MyClass1{
     fun testSingleton(){
         var singleton = Singleton.getInstance()
         //    println(singleton);
         singleton.showNameTest()

     }
}

fun main(args: Array<String>) {

    function1()

    function2()

    function3()
}

private fun function1(){
    var singleton = Singleton.getInstance()
    singleton.name = "hello John"
//    println(singleton);
}

private fun function2(){
    var singleton = Singleton.getInstance()
//    println(singleton);

    singleton.showNameTest()

}

private fun function3(){
    var myClass1 = MyClass1()
    myClass1.testSingleton()

}


