package org.jsp.bank;

import java.util.Scanner;

public class login extends Register{
	Scanner ip=new Scanner(System.in);
	public void register() {
		signup();
		signin();
	}
	
	public void signin() {
		System.out.println("enter id");
		int id=ip.nextInt();
		System.out.println("enter password");
		String pass=ip.next();
		if(getId()==id && getPassword().equals(pass)) {
			System.out.println("login successfully");
			AccountType();
		}else {
			System.err.println("password or id incorrected please try again...!");
			signin();
		}
	}

}
