package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 30);
        map.put(2, 90);
        map.put(3, 40);
        map.put(4, 70);
        map.put(5, 50);
        
        List<Integer> sortedValues = getValues(map);
        System.out.println("Sorted values: " + sortedValues);
    }

   public static List<Integer> getValues(HashMap<Integer, Integer> map) {
	   Collection<Integer> values = map.values();
	   
	   List<Integer> valueList = new ArrayList<>(values);
	   
	   Collections.sort(valueList);
	   
	   return valueList;
   }
}
