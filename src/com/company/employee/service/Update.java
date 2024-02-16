package com.company.employee.service;

import java.util.Scanner;

import com.company.employee.data.Employee;

public class Update {
	Update(){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice 1.Add employee 2.Update Employee");
		int choice=sc.nextInt();
		
		switch(choice) {
			case 1://ADD
				System.out.println("Enter the Id employee:");
				int id=sc.nextInt();
				if(checkIfUserExists(id)) {
					
				
				System.out.println("Enter the basic details of employee:");
				System.out.println("Enter Name Salary Age Current_Company and Pre_Company");
				
				String name=sc.nextLine();
				int salary=sc.nextInt();
				int age=sc.nextInt();
				String curr_comp=sc.nextLine();
				String prev_comp=sc.nextLine();
				
				Employee e=new Employee(id,name,age,salary,curr_comp,prev_comp);

				}
				
			case 2://Update
				System.out.println("");
				

				
				
			
		}
		
	}

	private  boolean checkIfUserExists(int id) {
		return false;		
	}
}
