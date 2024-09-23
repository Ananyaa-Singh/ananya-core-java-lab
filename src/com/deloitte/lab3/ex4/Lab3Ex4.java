package com.deloitte.lab3.ex4;

//Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. The digit in the units place can be left as it is. 

public class Lab3Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 45862;
        int output = modifyNumber(input);
        System.out.println("Modified number: " + output); // Output: 13242
	}

	public static int modifyNumber(int num) {
		String str = Integer.toString(num);
		
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<str.length()-1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			
			int digit1 = Character.getNumericValue(ch1);
			int digit2 = Character.getNumericValue(ch2);
			
			int diff = Math.abs(digit1 - digit2);
			
			result.append(diff);
		}
		
		result.append(str.charAt(str.length()-1));
		
		return Integer.parseInt(result.toString());
	}
}
