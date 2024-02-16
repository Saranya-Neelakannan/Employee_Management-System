package com.company.employee.service;

import java.util.LinkedList;

import com.company.employee.data.Employee;

public class View {
	public Employee searchEmployee(int empId){
		for(Employee e:Initialize.employee) {
			if(empId==(e.employeeId)) {
				return e;
			}
		}
		
			return null;
	}
	
	public LinkedList<Employee> viewAllEmployee(){
		for(Employee e:Initialize.employee) {
			System.out.println(e);
			
		}
	}

	
}
