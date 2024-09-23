package com.deloitte.lab4.ex2.com.cg.eis.pl;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeService;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		Employee employee = new Employee(0, "", 0.0, "");
		
		employeeService.getEmployeeDetails(employee);
		
		employeeService.displayEmployeeDeatils(employee);
	}

}

//Output-
//Enter Employee ID
//101
//Enter Employee Name:
//john
//Enter Employee Salary:
//30000
//Enter Employee Designation:
//Programmer
//Employee [id=101, name=john, salary=30000.0, designation=Programmer, insuranceScheme=Scheme B]
