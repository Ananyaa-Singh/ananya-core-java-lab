package com.deloitte.lab9.ex2;

import java.util.function.Function;

public class Lab9Ex2 {

	public static void main(String[] args) {
		
		
        Function<String, String> formatString = (str) -> String.join(" ", str.split(""));

        
        String input = "CG";
        String result = formatString.apply(input);

        
        System.out.println("Formatted string: " + result);
	}

}
