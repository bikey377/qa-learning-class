package com.java.learning.automation;

public class DisplayingMethods {

	public static void main(String[] args) {
		add(5,5);
		substract(5,10);
		multiply(5,6);
		div(15,5);
		squa(5);
		
	}
   // Add Method
	public static void add (int a, int b) {
	System.out.println(a+b);
}
	
	//Substract Method
	public static void substract (int a, int b) {
		System.out.println(b-a);
	}
	
	//Multiply Method
	public static void multiply (int a, int b) {
		System.out.println(a*b);
	}
	
	//Division Method
	public static void div (int a, int b) {
		System.out.println(a/b);
	
	}
	
	//Square Method
	public static void squa (int a) {
		System.out.println(a*a);
	}
}