package org.jsp.bank;

import java.util.Scanner;

public class Banking {
	Scanner ip=new Scanner(System.in);
	public void AccountType() {
		System.out.println("1.Savings");
		System.out.println("2.current");
		System.out.println("3.change Password");
		System.out.println("4.exit");
		try {
		int a=Integer.parseInt(ip.next());
		Accounts account=accountFactory.getInstance(a);
		switch(a) {
		case 1:
			account.account();
			AccountType();
			break;
		case 2:
			account.account();
			AccountType();
			break;
		case 3:
			changePass();
			break;
		case 4:
			System.exit(0);
			break;
			default:
				System.out.println("choose correct Option..! try again");
				AccountType();
		}
		}catch(Exception e) {
			System.err.println("invalid Option");
			AccountType();
		}
	}
	public void changePass() throws Exception{
		System.out.println("enter the Current Password");
		String pass=ip.next();
		login r=new login();
		if(pass.equals(r.getPassword())) {
			r.createpass();
		}
		r.signin();
		
	}
}
