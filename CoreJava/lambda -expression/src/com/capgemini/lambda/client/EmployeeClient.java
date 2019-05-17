package com.capgemini.lambda.client;

import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
			
		TreeSet<Employee> employees=new TreeSet<>((obj,obj2)->Integer.compare(obj.getEmployeeId(),obj2.getEmployeeId()));
		
		employees.add(new Employee(101,"alex","HR",34000));
		employees.add(new Employee(56,"Grant","Admin",12000));
		employees.add(new Employee(88,"Bob","Admin",56000));
		employees.add(new Employee(12,"Taylor","HR",312000));
		
		for (Employee employee : employees) {
			System.out.println(employee);
			
		}
	}
}
