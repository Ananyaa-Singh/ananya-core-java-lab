package com.deloitte.lab3.ex3;

//Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 

public class Lab3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "JAVA";
	     String output = alterString(input);
	     System.out.println(output);
	}
	
	public static String alterString(String input) {
		StringBuffer result = new StringBuffer();
		
		char[] characters = input.toCharArray();
		
		for(char ch : characters) {
			if(isConsonant(ch)) {
				result.append(nextCharacter(ch));
			}
			else {
				result.append(ch);
			}
		}
		
		return result.toString();
		
	}

	private static boolean isConsonant(char ch) {
		return Character.isLetter(ch) && !isVowel(ch);
	}
	
	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}
	
	private static char nextCharacter(char ch) {
		if(ch == 'z') return 'a';
		if(ch == 'Z') return 'A';
		
		return (char) (ch+1);
	}
}
