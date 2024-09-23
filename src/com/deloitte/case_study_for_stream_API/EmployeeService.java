package com.deloitte.case_study_for_stream_API;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeService {

    //Find out the sum of salary of all employees
    public double getTotalSalary() {
        return EmployeeRepository.getEmployees()
                .stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    //List out department names and count of employees in each department
    public Map<String, Long> getEmployeeCountByDepartment() {
        return EmployeeRepository.getEmployees()
                .stream()
                .filter(emp -> emp.getDepartment() != null)
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(), Collectors.counting()));
    }

    //Find out the senior most employee of an organization
    public Employee getSeniorMostEmployee() {
        return EmployeeRepository.getEmployees()
                .stream()
                .min(Comparator.comparing(Employee::getHireDate))
                .orElse(null);
    }

    //List employee name and duration of their service in months and days
    public Map<String, Period> getEmployeeServiceDuration() {
        return EmployeeRepository.getEmployees()
                .stream()
                .collect(Collectors.toMap(
                        emp -> emp.getFirstName() + " " + emp.getLastName(),
                        emp -> Period.between(emp.getHireDate(), LocalDate.now())
                ));
    }

    //Find out employees without department
    public List<Employee> getEmployeesWithoutDepartment() {
        return EmployeeRepository.getEmployees()
                .stream()
                .filter(emp -> emp.getDepartment() == null)
                .collect(Collectors.toList());
    }

    

    //Find departments with the highest count of employees
    public Optional<Map.Entry<String, Long>> getDepartmentWithMostEmployees() {
        return getEmployeeCountByDepartment()
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
    }

    //List employee name, salary and salary increased by 15%
    public Map<String, Double> getEmployeeSalaryIncrease() {
        return EmployeeRepository.getEmployees()
                .stream()
                .collect(Collectors.toMap(
                        emp -> emp.getFirstName() + " " + emp.getLastName(),
                        emp -> emp.getSalary() * 1.15
                ));
    }
}
