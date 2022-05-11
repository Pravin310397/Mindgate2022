package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMain {
	public static void main(String[] args) {
		Account account = new Account(101, "Nitesh Subhedar", 1000);
		
		System.out.println(account.getAccountnumber());
		System.out.println(account.getBalance());
		System.out.println(account.getName());
		
		
		System.out.println("_".repeat(50));
		
		
		Account account2 = new Account();
		account2.setAccountnumber(102);
		account2.setName("mahesh");
		account2.setBalance(10000);
		
		System.out.println(account2.getAccountnumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
	}
}
