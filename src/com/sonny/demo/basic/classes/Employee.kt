package com.sonny.demo.basic.classes

import com.sonny.demo.basic.classes.Person;

class Employee(name: String): Person(name) {
	
    // �@�ӥi�H���ܭȪ��ݩʡ]property�^
    var salary: Double = 0.0

	// �䥦�غc���A�ϥ�this(name)�I�s�D�n�غc��
    constructor(name: String, gender: Char, salary: Double): this(name) {
        // �]�w�~�Ӧۤ����O���ݩʭ�
        super.gender = gender
    
		// �]�w�ݩʭ�
        this.salary = salary
    }
 
    // �мg�~�Ӧۤ����O���禡
    override fun printInformation() {
        // �I�s�����O���禡
        super.printInformation()
        println("Salary: $salary")
    }	
}