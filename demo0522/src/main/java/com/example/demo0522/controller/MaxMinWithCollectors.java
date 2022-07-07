package com.example.demo0522.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo0522.model.Employee;

public class MaxMinWithCollectors {
	static List<Employee> employeeList
    = Arrays.asList(new Employee("Tom Jones1", 45, 15000.00),
      new Employee("Tom Jones", 45, 15000.00),
      new Employee("Ethan Hardy", 65, 8000.00),
      new Employee("Nancy Smith", 22, 10000.00),
      new Employee("Deborah Sprightly", 29, 9000.00));

public static void main(String[] args) {
Optional<Employee> maxSalaryEmp = 
        employeeList.stream()
        .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
System.out.println("Employee with max salary:"
        + (maxSalaryEmp.isPresent()? maxSalaryEmp.get().getName():"Not Applicable"));

}
}


