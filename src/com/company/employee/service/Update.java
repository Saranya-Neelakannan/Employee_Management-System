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
				
				Add.employee.add(e);

				}
				
			case 2://Update
				System.out.println("Whether you need to update 1.Basic details or 2.Address Details");
				int detailsChoice=sc.nextInt();
				System.out.println("enter the id");
				int empid=sc.nextInt();
				int updateid=sc.nextInt();
				
				if(detailsChoice==1) {
		
					System.out.println("what you need to update 1.salary 2.age 3.currentcompany 4.prevcompany");
					int empDetailsChoice  = sc.nextInt();
					
					if(empDetailsChoice==1){
						System.out.println("enter the updated salary");
						int updatedSalary=sc.nextInt();
						updatedSalary(empid,updatedSalary);
						
					}
					if(empDetailsChoice==2) {
						System.out.println("Enter the updated age");
						int updatedAge=sc.nextInt();
						updatedAge(empid,updatedAge);
					}
					if(empDetailsChoice==3) {
						System.out.println("Enter the updated current company");
						String updatedCurrentCompany=sc.next();
						updatedCurrentCompany(empid,updatedCurrentCompany);
						
					}
					if (empDetailsChoice==4) {
						System.out.println("enter the updated previous company");
						String updatedPrevCompany=sc.next();
						updatedPrevCompany(empid,updatedPrevCompany);
						
					}
					
				}
				
				

				
				
			
		}
		
	}

	private  boolean checkIfUserExists(int id) {
		return false;		
	}
}
