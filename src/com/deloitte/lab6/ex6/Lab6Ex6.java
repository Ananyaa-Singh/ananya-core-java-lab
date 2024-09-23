package com.deloitte.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {
	
    public static List<Integer> votersList(Map<Integer, LocalDate> people) {
        
        List<Integer> eligibleVoters = new ArrayList<>();
        
        
        LocalDate currentDate = LocalDate.now();
        
        
        for (Map.Entry<Integer, LocalDate> entry : people.entrySet()) {
            int id = entry.getKey();
            LocalDate dob = entry.getValue();
            
            
            int age = Period.between(dob, currentDate).getYears();
            
            
            if (age >= 18) {
                eligibleVoters.add(id);
            }
        }
        
        
        return eligibleVoters;
    }

    public static void main(String[] args) {
        
        Map<Integer, LocalDate> people = new HashMap<>();
        people.put(101, LocalDate.of(2000, 5, 15));
        people.put(102, LocalDate.of(2010, 4, 10));
        people.put(103, LocalDate.of(1990, 12, 1));
        people.put(104, LocalDate.of(2005, 7, 22));

        
        List<Integer> eligibleVoters = votersList(people);
        System.out.println("Eligible voters: " + eligibleVoters);
    }
}
