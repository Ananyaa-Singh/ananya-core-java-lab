package com.deloitte.lab4.ex2.com.cg.eis.service;

import java.util.Scanner;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void getEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		employee.setId(sc.nextInt());
		
		System.out.println("Enter Employee Name:");
        employee.setName(sc.next());

        System.out.println("Enter Employee Salary:");
        employee.setSalary(sc.nextDouble());

        System.out.println("Enter Employee Designation:");
        employee.setDesignation(sc.next());
        
        employee.setInsuranceScheme(findInsuranceScheme(employee));
		
	}

	@Override
	public String findInsuranceScheme(Employee employee) {
		// TODO Auto-generated method stub
		double salary = employee.getSalary();
		String designation = employee.getDesignation();
		
		if(salary > 5000 && salary <= 20000 && designation.equalsIgnoreCase("System Associate")) {
			return "Scheme C";
		}
		else if (salary > 20000 && salary <= 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } 
		else if (salary > 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } 
		else if (salary <= 5000 && designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        } 
		else {
            return "No Scheme";
        }

	}

	@Override
	public void displayEmployeeDeatils(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee);
	}
	
}
