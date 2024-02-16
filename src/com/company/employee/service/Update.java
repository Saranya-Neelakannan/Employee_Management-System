package com.company.employee.service;

import java.util.Scanner;

import com.company.employee.data.Address;
import com.company.employee.data.Employee;

import UserNotFoundException.UserAlreadyExists;

public class Update {
    Update(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice 1.Add employee 2.Update Employee 3.Search User 4.View All User");
        int choice=sc.nextInt();
        View view =new View();

        switch(choice) {
            case 1://ADD
                System.out.println("Enter the Id employee:");
                int id=sc.nextInt();
                if(!checkIfUserExists(id)) {
                    System.out.println("Enter the basic details of employee:");
                    System.out.println("Enter Name Salary Age Current_Company and Pre_Company");

                    // Consume newline character left in buffer
                    sc.nextLine();

                    String name=sc.nextLine();
                    int salary=sc.nextInt();
                    int age=sc.nextInt();

                    // Consume newline character left in buffer
                    sc.nextLine();

                    String curr_comp=sc.nextLine();
                    String prev_comp=sc.nextLine();

                    System.out.println("Enter the address details of employee:");
                    System.out.println("Enter DNo Street State City Country Pincode");

                    int doorNumber=sc.nextInt();
                    sc.nextLine(); // Consume newline character left in buffer
                    String street=sc.nextLine();
                    String state=sc.nextLine();
                    String city=sc.nextLine();
                    String country=sc.nextLine();
                    int pincode=sc.nextInt();

                    Address ad=new Address(doorNumber,street,state,city,country,pincode);
                    Employee e=new Employee(id,name,age,salary,curr_comp,prev_comp,ad);

                    Initialize.employee.add(e);
                } else {
                    System.out.println("Employee with ID " + id + " already exists!");
                }
                break;
                
            case 2://Update
                System.out.println("Whether you need to update 1.Basic details or 2.Address Details 3.Search Employee 4.View All Employee");
                int detailsChoice=sc.nextInt();
                System.out.println("enter the id");
                int empid=sc.nextInt();
                
                switch(detailsChoice) {
                    case 1:
                        System.out.println("what you need to update 1.salary 2.age 3.currentcompany 4.prevcompany");
                        int empDetailsChoice  = sc.nextInt();

                        switch(empDetailsChoice) {
                            case 1:
                                System.out.println("enter the updated salary");
                                int updatedSalary=sc.nextInt();
                                updatedSalary(empid,updatedSalary);
                                break;
                            case 2:
                                System.out.println("Enter the updated age");
                                int updatedAge=sc.nextInt();
                                updatedAge(empid,updatedAge);
                                break;
                            case 3:
                                System.out.println("Enter the updated current company");
                                String updatedCurrentCompany=sc.next();
                                updatedCurrentCompany(empid,updatedCurrentCompany);
                                break;
                            case 4:
                                System.out.println("enter the updated previous company");
                                String updatedPrevCompany=sc.next();
                                updatedPrevCompany(empid,updatedPrevCompany);
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                        break;
                    case 2:
                        System.out.println("what you need to update 1.DoorNo , 2.Street , 3.City , 4.State , 5.Country , 6.PinCode");
                        int AddressDetails = sc.nextInt();

                        switch(AddressDetails) {
                            case 1:
                                System.out.println("Enter ther updated Doorno");
                                int updatedDoorNo=sc.nextInt();
                                updatedDoorNo(empid,updatedDoorNo);
                                break;
                            case 2:
                                System.out.println("Enter ther updated Street");
                                String updatedStreet=sc.next();
                                updatedStreet(empid,updatedStreet);
                                break;
                            case 3:
                                System.out.println("Enter the updated City");
                                String updatedCity=sc.next();
                                updatedCity(empid,updatedCity);
                                break;
                            case 4:
                                System.out.println("Enter the updated State");
                                String updatedState=sc.next();
                                updatedState(empid,updatedState);
                                break;
                            case 5:
                                System.out.println("Enter the updated Country");
                                String updatedCountry=sc.next();
                                updatedCountry(empid,updatedCountry);
                                break;
                            case 6:
                                System.out.println("Enter the updated postal code");
                                int updatedPostalCode=sc.nextInt();
                                updatedPostalCode(empid,updatedPostalCode);
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;
                
            case 3:
                System.out.println("Enter EmpId to Search");
                int empId=sc.nextInt();
                view.searchEmployee(empId);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    private void updatedState(int empid, String updatedState) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.address.state=updatedState;
            }
        }
	}

	private void updatedPostalCode(int empid, int updatedPostalCode) {
        for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.address.pincode=updatedPostalCode;
            }
        }
    }

    private void updatedCountry(int empid, String updatedCountry) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.address.country=updatedCountry;
            }
        }

    }

   
    private void updatedCity(int empid, String updatedState) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.address.state=updatedState;
            }
        }

    }

    private void updatedStreet(int empid, String updatedStreet) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.address.street=updatedStreet;
            }
        }


    }

    private void updatedDoorNo(int empid, int updatedDoorNo) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.address.doorNumber=updatedDoorNo;
            }
        }

    }

    private void updatedAge(int empid, int updatedAge) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.age=updatedAge;
            }
        }

    }

    private void updatedCurrentCompany(int empid, String updatedCurrentCompany) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.currentCompany=updatedCurrentCompany;
            }
        }

    }

    private void updatedSalary(int empid, int updatedSalary) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.salary=updatedSalary;
            }
        }

    }

    private void updatedPrevCompany(int empid, String updatedPrevCompany) {
    	for(Employee e:Initialize.employee) {
            if(empid==(e.employeeId)) {
                e.prevCompany=updatedPrevCompany;
            }
        }

    }

    private boolean checkIfUserExists (int id) {
        for (Employee e : Initialize.employee) {
        	try {
            if (e.employeeId == id) {
            	throw new UserAlreadyExists("User Already Exists");
            }
        	}
            catch(UserAlreadyExists u){
            	System.out.println(u);
            }
        return true;
    }
		return false;
}
}
