package com.company.employee.service;

import java.util.LinkedList;

import com.company.employee.data.Employee;

public class View {
	public void searchEmployee(int empId){
		for(Employee e:Initialize.employee) {
			if(empId==(e.employeeId)) {
				System.out.println(e);
				return;
			}
		}
 
			System.out.println("Employee not found");
			
	}
	
	public void viewAllEmployee(){
		for(Employee e:Initialize.employee) {
			System.out.println(e);
			
		}
	}

	
}
