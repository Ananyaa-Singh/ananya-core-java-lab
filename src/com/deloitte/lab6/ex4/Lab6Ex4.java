package com.deloitte.lab6.ex4;

import java.util.HashMap;

public class Lab6Ex4 {

	public static void main(String[] args) {
		
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(101, 92);
        studentMarks.put(102, 85);
        studentMarks.put(103, 75);
        studentMarks.put(104, 60);

        
        HashMap<Integer, String> eligibleStudents = getStudents(studentMarks);
        System.out.println("Eligible students for medals: " + eligibleStudents);
	}
	
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        
        HashMap<Integer, String> medalList = new HashMap<>();
        
        
        for (HashMap.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int regNumber = entry.getKey();
            int marks = entry.getValue();
            
            
            if (marks >= 90) {
                medalList.put(regNumber, "Gold");
            } else if (marks >= 80 && marks < 90) {
                medalList.put(regNumber, "Silver");
            } else if (marks >= 70 && marks < 80) {
                medalList.put(regNumber, "Bronze");
            }
        }
        
        
        return medalList;
    }
}
