package com.company.employee.exceptions;

public class UserAlreadyExists extends RuntimeException{
	public UserAlreadyExists (String s){
		super(s);
	}
}
