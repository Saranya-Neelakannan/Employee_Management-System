package com.company.employee.data;

public class Employee {


	public int  employeeId;
	public String name;
	public int age;
	public int salary;
	public String currentCompany;
	public String prevCompany;
	public Address address;
	

	

	public Employee(int employeeId,String name ,int age, int salary, String currentCompany, String prevCompany,Address address) {

		
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.currentCompany = currentCompany;
		this.prevCompany = prevCompany;
		this.address=address;
	}
	
	
}
