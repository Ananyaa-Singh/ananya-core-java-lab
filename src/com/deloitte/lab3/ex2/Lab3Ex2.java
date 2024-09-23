package com.deloitte.lab3.ex2;

//Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .

public class Lab3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "EARTH";
		String output = getImage(input);
		System.out.println(output);
	}
	
	public static String getImage(String input) {
		StringBuffer str = new StringBuffer(input);
		String reversed = str.reverse().toString();
		String result = input + "|" + reversed;
		
		return result;
	}

}
