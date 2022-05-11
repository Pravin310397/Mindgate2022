package com.mindgate.pojo;

public class Account {
	private int accountnumber;
	private String name;
	private double balance;

	public Account() {
		System.out.println("default constructor of account");
	}

	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		System.out.println("Overloaded constructer of Account");
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean withdraw(double amount) {
		if (balance >= amount && amount > 0) {
			balance = balance - amount;
			return true;
		}
		return false;

	}

	public boolean depoites(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
