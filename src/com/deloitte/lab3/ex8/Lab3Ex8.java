package com.deloitte.lab3.ex8;

//Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should return true if the entered string is positive.

public class Lab3Ex8 {

	 public static void main(String[] args) {
		 System.out.println(isPositiveString("ANT"));  // true
	        System.out.println(isPositiveString("BAT"));  // false
	        System.out.println(isPositiveString("XYZ"));  // true
	        System.out.println(isPositiveString("APPLE"));  // false
	 }
	 
	 public static boolean isPositiveString(String str) {
		 str=str.toUpperCase();
		 
		 for(int i=0; i<str.length()-1; i++) {
			 if(str.charAt(i) > str.charAt(i+1)) {
				 return false;
			 }
		 }
		 return true;
	 }
}
