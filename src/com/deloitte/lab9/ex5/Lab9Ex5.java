package com.deloitte.lab9.ex5;

import java.util.function.Function;

class FactorialDemo {
    
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
  }
}

public class Lab9Ex5 {

	public static void main(String[] args) {
		
        Function<Integer, Long> factRef = FactorialDemo::factorial;

        
        int number = 5;
        long result = factRef.apply(number);
        System.out.println("Factorial of " + number + " is: " + result);

	}
}

