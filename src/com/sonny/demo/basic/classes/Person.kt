package com.sonny.demo.basic.classes

/* ##### open �N��i�H�Q�~�Ӫ�class ##### */
// (var name: String)�O�@�Ӧr��Ѽƪ��D�n�غc���]primary constructor�^
open class Person (var name: String) {
	
	// �@�ӥi�H���ܭȪ��ݩʡ]property�^
	var gender: Char = 'U';
	
	val information: String
        // ��information�[�Jgetter��k
        get() = "$name(${if (gender=='M') "Male" else "Female"})";
	
	 // �䥦�غc���A�ϥ�this(name)�I�s�D�n�غc��
    constructor(name: String, gender: Char) : this(name) {
        // �]�w�ݩ�
        this.gender = gender
    }
 
    // �禡
    fun sayGreeting() {
        println("Hello, $name!")
    }
 
    // �禡�A�ϥ�open���l���O�i�H�мg�o�Ӥ�k
    open fun printInformation() {
        println("Name: $name")
        println("Gender: $gender")
    }
}