package com.deloitte.case_study_for_stream_API;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public static List<Employee> getEmployees() {
        Department dept1 = new Department(1, "HR", 101);
        Department dept2 = new Department(2, "Engineering", 102);
        Department dept3 = new Department(3, "Finance", 103);

        return Arrays.asList(
                new Employee(1, "John", "Doe", "john@example.com", "1234567890", LocalDate.of(2015, 5, 20),
                        "Engineer", 75000, 102, dept2),
                new Employee(2, "Jane", "Smith", "jane@example.com", "0987654321", LocalDate.of(2017, 3, 18),
                        "Manager", 85000, 103, dept3),
                new Employee(3, "Peter", "Parker", "peter@example.com", "1231231234", LocalDate.of(2012, 8, 14),
                        "HR", 55000, 101, dept1),
                new Employee(4, "Bruce", "Wayne", "bruce@example.com", "9876543210", LocalDate.of(2020, 1, 5),
                        "CEO", 100000, null, null),
                new Employee(5, "Clark", "Kent", "clark@example.com", "5555555555", LocalDate.of(2019, 11, 30),
                        "Reporter", 60000, 101, dept1)
        );
    }
}

