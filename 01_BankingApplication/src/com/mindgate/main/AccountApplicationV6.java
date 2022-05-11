package com.mindgate.main;

import java.util.Currency;

import com.mindgate.pojo.Current;

public class AccountApplicationV6 {
	public static void main(String[] args) {
		Current current = new Current(101, "Pravin", 10000, 50000);
		
		System.out.println(current);
		System.out.println("Withdraw : 5000");
		current.withdraw(5000);
		System.out.println(current);

		System.out.println();

		System.out.println("Withdraw : 20000");
		current.withdraw(20000);
		System.out.println(current);

		System.out.println();

		System.out.println("Deposit :5000");
		current.depoites(5000);
		System.out.println(current);
	}
}
