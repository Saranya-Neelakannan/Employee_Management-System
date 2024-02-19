package com.company.employee.data;

public class Admin {
	
	public int AdminId;
	public String adminName;
	public String password;
	public String role;
	
	

	public Admin(int adminId, String adminName, String password, String role) {
		
		this.AdminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.role = role;

	}


	public Admin() {
		
	}




	public int getAdminId() {
		return AdminId;
	}



	public void setAdminId(int adminId) {
		AdminId = adminId;
	}



	public String getAdminName() {
		return adminName;
	}



	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}
	
	

}
