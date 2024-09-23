package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

    public static void main(String[] args) {
        // 
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a', 'd', 'c'};
        
        Map<Character, Integer> charCountMap = countChars(arr);
        System.out.println("Character Frequency: " + charCountMap);
    }

    public static Map<Character, Integer> countChars(char[] arr) {
        
        Map<Character, Integer> charCountMap = new HashMap<>();
        
       
        for (char c : arr) {
            
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } 
            
            else {
                charCountMap.put(c, 1);
            }
        }
        
        return charCountMap;
    }
}