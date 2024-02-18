package com.company.employee.service;

import java.util.LinkedList;

import com.company.employee.data.Address;
import com.company.employee.data.Admin;
import com.company.employee.data.Employee;



public class Initialize{
	static LinkedList<Employee> employee;
	static Address ad1=new Address(1,"Street1","TamilNadu","Salem","India",636401);
	static Address ad2=new Address(2,"Street2","TamilNadu","Theni","India",600231);
	static Address ad3=new Address(3,"Street3","TamilNadu","Tanjore","India",637861);
	static {
		employee = new LinkedList<>();
		employee.add(new Employee(10,"saranya",25,50000,"Onebill","Salesforce",ad1));
		employee.add(new Employee(11,"sudhan",25,40000,"Onebill","Amazon",ad2));
		employee.add(new Employee(12,"madhu",25,40000,"Onebill","Tekion",ad3));
		
	}
	
	static LinkedList<Admin> adminList;
	static {
		adminList = new LinkedList<>();
		adminList.add(new Admin(1,"john","1234","ADMINALL"));
		adminList.add(new Admin(2,"vijay","5678","ADMINVIEW"));
		adminList.add(new Admin(3,"suriya","7890","ADMINVIEW"));
		
	}
	
public boolean checkIfAdminExists(int id) {
    	
    	
    	for(Admin admin: adminList) {
    		if(admin.AdminId ==id) {
    			return true;
    		}
    	}
    	return false;

    }
	
}
