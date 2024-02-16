package com.company.employee.service;

import java.util.LinkedList;

import com.company.employee.data.Employee;



public class Add{
	static LinkedList<Employee> employee;
	static {
		employee = new LinkedList<>();
		employee.add(new Employee(1,"saranya",25,50000,"Onebill","Salesforce"));
		employee.add(new Employee(2,"sudhan",25,40000,"Onebill","Amazon"));
		employee.add(new Employee(3,"madhu",25,40000,"Onebill","Tekion"));
		
	}
}
	