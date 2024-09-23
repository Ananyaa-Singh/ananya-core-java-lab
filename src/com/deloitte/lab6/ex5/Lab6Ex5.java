package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex5 {

	 public static int getSecondSmallest(int[] arr) {
	        
	        List<Integer> list = new ArrayList<>();
	        for (int num : arr) {
	            list.add(num);
	        }

	        
	        Collections.sort(list);

	       
	        return list.get(1);
	    }

	    public static void main(String[] args) {
	        
	        int[] arr = {5, 12, 3, 19, 1, 7};

	        
	        int secondSmallest = getSecondSmallest(arr);
	        System.out.println("The second smallest element is: " + secondSmallest);
	    }

}
