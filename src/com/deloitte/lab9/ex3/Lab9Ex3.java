package com.deloitte.lab9.ex3;

import java.util.function.BiPredicate;

public class Lab9Ex3 {

	public static void main(String[] args) {
		
		
        String validUsername = "admin";
        String validPassword = "password123";

        
        BiPredicate<String, String> authenticate = (username, password) -> 
                username.equals(validUsername) && password.equals(validPassword);

        
        String inputUsername = "admin";
        String inputPassword = "password123";
        
        
        boolean isAuthenticated = authenticate.test(inputUsername, inputPassword);

        
        System.out.println("Authentication successful: " + isAuthenticated);

	}

}
