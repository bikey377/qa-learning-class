package com.java.learning.automation;

public class LearningMyFirstCoreJava {
	int age = 21;
	int salary = 5000;
	static int herAge = 16;
	
	String name = "David";
	String address = "2300 valley view";
	
	public static void main(String[] args) {
		int hisAge = 19;
		LearningMyFirstCoreJava myVariable = new LearningMyFirstCoreJava();
		System.out.println("This is instance variable = " + myVariable.age);
		System.out.println("This is my salary = " + myVariable.salary);
		System.out.println("This is local variable = " + hisAge);
		System.out.println("This is static variable = " + herAge);

	}

}
