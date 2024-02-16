package com.company.employee.data;

public class Admin {
	
	public int AdminId;
	public String adminName;
	public int password;
	public String role;
	
//	public ArrayList<Admin> admin = new ArrayList<>();

	public Admin(int adminId, String adminName, int password, String role) {
		
		AdminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.role = role;
//	
	}

}
