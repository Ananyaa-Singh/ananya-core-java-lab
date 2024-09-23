package com.deloitte.lab9.ex1;

import java.util.function.BiFunction;

public class Lab9Ex1 {

	public static void main(String[] args) {
		 
		
        BiFunction<Integer, Integer, Integer> powerFunction = (x, y) -> (int) Math.pow(x, y);

        
        int x = 2;
        int y = 3;
        int result = powerFunction.apply(x, y);

        
        System.out.println(x + "^" + y + " = " + result);

	}

}
