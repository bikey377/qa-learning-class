package com.java.learning.automation;

import org.testng.annotations.Test;

public class Arrays {
	
	 @Test( enabled = true, description = " One dimensional array")
	 public void myArrayMethod(){
	 String [] name = new String [5] ;
	 name[0]= " David";
	 name[1]= " Bd";
	 name[2]= " Cid";
	 name[3]= " Did";
	 name[4]= " Diod";
	 for (int i = 0; i < name.length; i++) {
	 System.out.println(" This is one dimensional array : " + i);

	 }	

	 for (String dancer : name) {
	 System.out.println(dancer);
	 }

	 }

	 // to see printing 
	 @Test(enabled = true , description = " Two dimensional array")
	 public void myTwoArrayMethod(){
	 String[][] arrStr = new String[3][4];
	 for (int i = 0; i < arrStr.length; i++) {
	 for (int j = 0; j < arrStr[i].length; j++) {
	 arrStr[i][j] = "Str" + j;
	 System.out.print(arrStr[i][j] + " ");
	 }
	 System.out.println("");
	 }
	 }
}
