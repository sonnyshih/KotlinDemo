package com.sonny.demo;


fun main(args: Array<String>) {
	val x: Int = 3;  // �ϥ�val�ŧi���i���ܪ��ܼ�
	val y = 5;       // �ϥγ]�w�ȱ����ܼƫ��A

	val z: Int;      // �S���]�w�Ȫ��ܼƴN�@�w�n���w���A
	z = 7;           // �]�w�ȥH��N���i�H����

	println("/* ##### ���i�����ܼ� Start ##### */");
	println("X: " + x);
	println("Y: " + y);
	println("Z: " + z);
	println("/* ##### ���i�����ܼ� End ##### */");

	println();

	var v: Int = 3;          // �ϥ�var�ŧi�i�H���ܪ��ܼ�
	v = 13;              // ���|�o�Ϳ��~

	println("/* ##### �i�����ܼ� Start ##### */");
	println("V: " + v);
	println("/* ##### �i�����ܼ� End ##### */");

	var greetString = getGreetString("Hello", "Simon");
	println(greetString);

	sayGreeting("Hello", "John");
	
	println("");
	
	// �ϥ�when (�pJava��Swith)
	whenDemo();
	println("");
	
	// �ϥ�While
	WhileDemo();
	println("");
	
	// �ϥ� do while 
	doWhileDemo();
	
	// �ϥ� for
	forDemo();
	println("");


}

fun getGreetString(greet: String, name: String): String {

	return greet + ", " + name + "!";
}

fun sayGreeting(greet: String, name: String) {
	println(greet + ", " + name + "!");
}

fun whenDemo(){
	
	println("##### when Demo (Start) #####");
	
	val grade = 'd';
    val bonus: Int;
	
	 when (grade) {
        'A'     ->
			bonus = 5000
        'B'     -> bonus = 3000
        'C'     -> bonus = 1000
        else    -> bonus = 50
    }
 
    // ��ܡG Bonus: 3000
    println("Bonus: $bonus")
 
    val bonus2 =
            when (grade) {
                'A'     -> 5000
                'B'     -> 3000
                'C'     -> 1000
                else    -> 50
            }
 
    // ��ܡG Bonus: 3000
    println("Bonus2: $bonus2");
	
	println("##### when Demo (End) #####");

}

fun WhileDemo(){
	
	println("##### while Demo (Start) #####");
	var index = 0
 
    while (index < 10) {
        print(index)
        index++
    }
	
	println("");
	println("##### while Demo (End) #####");
	
}

fun doWhileDemo(){
	
	println("##### do while Demo (Start) #####");
	
	var index = 0
 
    do {
        print(index)
        index++
    } while (index < 10)
    // ����{������ܡG 0123456789

	println("");
	println("##### do while Demo (End) #####");
}

fun forDemo(){
	
	println("##### for Demo 1 (Start) #####");
	// ��ܡG 12345
    for (index: Int in 1..5) {
        print(index)
    }
 
    println();
	println("##### for Demo 1 (End) #####");
	println();
	
	println("##### for Demo 2 (Start) #####");
    // ��ܡG 135
    for (index: Int in 1..5 step 2) {
        print(index)
	}
 
    println();
	println("##### for Demo 2 (End) #####");
 	println();
	
	println("##### for Demo 3 (Start) #####");
    // ��ܡG 54321
    for (index: Int in 5 downTo 1) {
        print(index);
	}

	println();
	println("##### for Demo 3 (End) #####");
	
}







