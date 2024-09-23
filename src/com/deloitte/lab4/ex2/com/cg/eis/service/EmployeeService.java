package com.deloitte.lab4.ex2.com.cg.eis.service;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

public interface EmployeeService {
	void getEmployeeDetails(Employee employee);
	String findInsuranceScheme(Employee employee);
	void displayEmployeeDeatils(Employee employee);
}
