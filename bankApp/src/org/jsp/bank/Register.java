package org.jsp.bank;

import java.util.Random;
import java.util.Scanner;

public class Register extends Banking{
	Scanner ip = new Scanner(System.in);
	private static String fname;
	private static String lname;
	private static int age;
	private static String gender;
	private static String password;
	private static int id;

	public void signup() {
		System.out.print("Enter first Name :");
		String fname = ip.nextLine();
		this.fname = fname;
		System.out.print("Enter Last Name :");
		String lname = ip.nextLine();
		this.lname = lname;
		System.out.print("enter your Age");
		try {
		int age = ip.nextInt();
		this.age = age;
		System.out.println("1.male");
		System.out.println("2.female");
		System.out.println("choose your gender");
		int i = ip.nextInt();
		switch (i) {
		case 1:
			this.gender = "male";
			break;
		case 2:
			this.gender = "female";
			break;
		default:
			System.out.println("choose the correct Option");
			signup();
		}
		}catch(Exception e) {
			System.err.println("invalid Option");
			signup();
		}
		generateId();
		createpass();
	}

	public void createpass() {
		System.out.println("enter new password");
		String pass = ip.next();
		if(pass.length()>3) {
		System.out.println("re-enter password");
		String repass = ip.next();
		if (pass.equals(repass)) {
			System.out.println("password succussfully created");
			this.password = pass;
			System.out.println("Your id is \""+this.id+"\"");
		} else {
			System.err.println("password is missmatch. try again");
			createpass();
		}
		}else {
			System.err.println("password should be atleast 4 character ");
			createpass();
		}
	}

	

	public void generateId() {
		Random r = new Random();
		int id = r.nextInt(9000) + 1000;
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
