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
				if(detailsChoice==2) {
					System.out.println("what you need to update 1.DoorNo , 2.Street , 3.City , 4.State , 5.Country , 6.PinCode");
					int  AddressDetails = sc.nextInt();
					if(AddressDetails==1) {
						System.out.println("Enter ther updated Doorno");
						int updatedDoorNo=sc.nextInt();
						updatedDoorNo(empid,updatedDoorNo);
						
					}
					if(AddressDetails==2) {
						System.out.println("Enter ther updated Street");
						String updatedStreet=sc.next();
						updatedStreet(empid,updatedStreet);
					}
					if (AddressDetails==3) {
						System.out.println("Enter the updated City");
						String updatedCity=sc.next();
						updatedCity(empid,updatedCity);
					}
					if (AddressDetails==4) {
						System.out.println("Enter the updated State");
						String updatedState=sc.next();
						updatedState(empid,updatedState);
					}
					
					if (AddressDetails==5) {
						System.out.println("Enter the updated Country");
						String updatedCountry=sc.next();
						updatedCountry(empid,updatedCountry);
					}
					if (AddressDetails==5) {
						System.out.println("Enter the updated postal code");
						int updatedPostalCode=sc.nextInt();
						updatedPostalCode(empid,updatedPostalCode);
					}
		}
		}
		
	}

	private void updatedPostalCode(int empid, int updatedPostalCode) {
		// TODO Auto-generated method stub
		
	}

	private void updatedCountry(int empid, String updatedCountry) {
		// TODO Auto-generated method stub
		
	}

	private void updatedState(int empid, String updatedState) {
		// TODO Auto-generated method stub
		
	}

	private void updatedCity(int empid, String updatedState) {
		// TODO Auto-generated method stub
		
	}

	private void updatedStreet(int empid, String updatedStreet) {
		// TODO Auto-generated method stub
		
	}

	private void updatedDoorNo(int empid, int updatedDoorNo) {
		// TODO Auto-generated method stub
		
	}

	private void updatedAge(int empid, int updatedAge) {
		// TODO Auto-generated method stub
		
	}

	private void updatedCurrentCompany(int empid, String updatedCurrentCompany) {
		// TODO Auto-generated method stub
		
	}

	private void updatedSalary(int empid, int updatedSalary) {
		// TODO Auto-generated method stub
		
	}

	private void updatedPrevCompany(int empid, String updatedPrevCompany) {
		// TODO Auto-generated method stub
		
	}

	private  boolean checkIfUserExists(int id) {
		return false;		
	}
}
