package org.jsp.bank;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class transactions extends login {
	static List<String> savings = new ArrayList<>();
	static List<String> current = new ArrayList<>();
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("E dd/MM/yyyy hh:mm:ss a");
	public void savingstransacation(int amount) {
		if (amount > 0) {
			String tran="\n\t\tdeposited with "+amount+ " on "+sdf.format(date);
			savings.add(tran);
		} else if (amount < 0) {
			String tran="\n\t\twithdrawn "+Math.abs(amount)+ " on "+sdf.format(date);
			savings.add(tran);
		}
	}

	public void currenttransaction(int amount) {
		if (amount > 0) {
			String tran="\n\t\tdeposited with "+amount+ " on "+sdf.format(date);
			current.add(tran);
		} else if (amount < 0) {
			String tran="\n\t\twithdrawn "+Math.abs(amount)+ " on "+sdf.format(date);
			current.add(tran);
		}
	}

	public void showTransaction(int account) {
		if (account == 1) {
			for (String i : savings) {
				System.out.println(i);
			}
		} else if (account == 2) {
			for (String i : current) {
				System.out.println(i);
			}
		}
		System.out.println("\n\t\tFull Name : "+getFname()+" "+getLname());
		System.out.println("\t\tId : "+getId());
		
	}
}
