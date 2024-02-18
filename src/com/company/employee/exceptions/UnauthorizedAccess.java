package com.company.employee.exceptions;

public class UnauthorizedAccess extends RuntimeException{
	public UnauthorizedAccess (String s){
		super(s);
	}

}
