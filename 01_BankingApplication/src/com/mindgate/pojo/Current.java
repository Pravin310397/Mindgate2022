package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountnumber, String name, double balance, double overdraftBalance) {
		super(accountnumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded constructor of current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount>0 && amount<= getBalance()) {
			amount=getBalance()-amount;
		
		
			
			
			
			
			
		}
		
		
		
		
		
		return false;
	}

	@Override
	public boolean depoites(double amount) {
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}



	

	
	}






