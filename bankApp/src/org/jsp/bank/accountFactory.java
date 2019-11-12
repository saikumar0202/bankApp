package org.jsp.bank;

public class accountFactory {
	public static Accounts getInstance(int account) {
		if(account==1) {
			return new savings();
		}
			if(account==2) {
				return new current();
		}
		return null;
	}
}
