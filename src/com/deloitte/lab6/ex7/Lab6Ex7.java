package com.deloitte.lab6.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab6Ex7 {

	public static int[] getSorted(int[] arr) {
        
        List<Integer> reversedList = new ArrayList<>();
        
        
        for (int num : arr) {
            String reversedString = new StringBuilder(String.valueOf(num)).reverse().toString();
            int reversedNum = Integer.parseInt(reversedString);
            reversedList.add(reversedNum);
        }
        
        
        Collections.sort(reversedList);
        
        
        int[] sortedArray = new int[reversedList.size()];
        for (int i = 0; i < reversedList.size(); i++) {
            sortedArray[i] = reversedList.get(i);
        }
        
        
        return sortedArray;
    }

    public static void main(String[] args) {
       
        int[] arr = {123, 456, 789, 421};
        
        
        int[] result = getSorted(arr);
        System.out.println("Sorted reversed numbers: " + Arrays.toString(result));
    }

}
