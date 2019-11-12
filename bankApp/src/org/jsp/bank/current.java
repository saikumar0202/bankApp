package org.jsp.bank;

import java.util.Scanner;


public class current  extends transactions implements Accounts{
	private int deposit;
	private int withdraw;
	private int balance;
	Scanner ip=new Scanner(System.in);
	
	public void account() throws Exception{
		System.out.println("1.deposit to current");
		System.out.println("2.withdraw from current");
		System.out.println("3.balanceEnquiry");
		System.out.println("4.Transcations");
		System.out.println("5.Back");
		System.out.println("6.exit");
		System.out.print("Choose Option above :");
		int a=ip.nextInt();
		switch(a) {
		case 1:
			deposit();
			Continue();
			break;
		case 2:
			withdraw();
			Continue();
			break;
		case 3:
			balanceEnquiry();
			Continue();
			break;
		case 4:
			showTransaction(2);
			Continue();
			break;
		case 5:
			break;
		case 6:
			System.out.println("Thank You");
			System.exit(0);
			break;
		default:
			System.out.println("choose the Correct Option");
			account();
		}
	}
	public void deposit() throws Exception{
		System.out.println("Enter the Amount");
		int deposit=ip.nextInt();
		this.balance+=deposit;
		currenttransaction(deposit);
		this.deposit=deposit;
		System.out.println("your account is deposited with "+this.deposit);
	}
	public void withdraw() throws Exception{
		System.out.println("Enter the Amount");
		int withdraw=ip.nextInt();
		if(this.balance>=withdraw) {
		this.balance-=withdraw;
		currenttransaction(-withdraw);
		this.withdraw=withdraw;
		System.out.println("your account is withdrawn with "+this.withdraw);
		}else {
			System.out.println("enter the amount between balance range");
			System.out.println("your balance "+this.balance);
			withdraw();
		}
	}
	public void balanceEnquiry() throws Exception{
		System.out.println("your savings account balance is "+this.balance);
	}
	public void Continue() throws Exception{
		System.out.println("1.continue");
		System.out.println("Or press any key exit");
		int a=ip.nextInt();
		if(a==1) {
			account();
		}else {
			System.out.println("thank you");
			System.exit(0);
		}
	}
}











