package com.deloitte.case_study_for_stream_API;

import java.util.Map;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		 EmployeeService service = new EmployeeService();

	        // 1. Total salary of all employees
	        System.out.println("Total Salary: " + service.getTotalSalary());

	        // 2. Department names and employee counts
	        System.out.println("Employee Count by Department: " + service.getEmployeeCountByDepartment());

	        // 3. Senior most employee
	        Employee seniorEmployee = service.getSeniorMostEmployee();
	        if (seniorEmployee != null) {
	            System.out.println("Senior Most Employee: " + seniorEmployee.getFirstName() + " " + seniorEmployee.getLastName());
	        }

	        // 4. Employee name and service duration
	        service.getEmployeeServiceDuration().forEach((name, period) ->
	                System.out.println(name + " has worked for " + period.getYears() + " years, "
	                        + period.getMonths() + " months, and " + period.getDays() + " days."));

	        // 5. Employees without department
	        System.out.println("Employees without department: " + service.getEmployeesWithoutDepartment());

	        // 6. Department with most employees
	        Optional<Map.Entry<String, Long>> deptWithMostEmployees = service.getDepartmentWithMostEmployees();
	        deptWithMostEmployees.ifPresent(entry -> System.out.println("Department with most employees: " + entry.getKey()));

	        // 7. Employee salary increased by 15%
	        service.getEmployeeSalaryIncrease().forEach((name, newSalary) ->
	                System.out.println(name + " new salary after 15% increase: " + newSalary));
	    }
}
