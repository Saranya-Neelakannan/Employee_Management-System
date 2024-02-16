package com.company.employee.data;

public class Employee {


	public int  EmployeeId;
	public int age;
	public String name;
	public int salary;
	public String currentCompany;
	public String prevCompany;
	public Employee(int employeeId, int age, String name, int salary, String currentCompany, String prevCompany) {
		
		EmployeeId = employeeId;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.currentCompany = currentCompany;
		this.prevCompany = prevCompany;
	}
	
	
}
