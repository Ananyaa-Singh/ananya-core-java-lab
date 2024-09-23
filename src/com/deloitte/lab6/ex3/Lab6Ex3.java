package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 4, 5};
        
        Map<Integer, Integer> squaresMap = getSquares(numbers);
        System.out.println("Number and their squares: " + squaresMap);
    }

    public static Map<Integer, Integer> getSquares(int[] numbers) {
        
        Map<Integer, Integer> squaresMap = new HashMap<>();
        
        
        for (int number : numbers) {
            
            squaresMap.put(number, number * number);
        }
        
        return squaresMap;
    }
}
