package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {
public static void main(String[] args) {
	Account account =new Account(101,"Nitesh Subhedar ",1000);
	
	boolean result = account.withdraw(2000);
	if(result) {
		System.out.println("Transaction Completed Successfully");
		System.out.println("Balance :: "+account.getBalance());
	}
	else
	{
		System.out.println("Transaction Failed");
		System.out.println("Balance :: "+account.getBalance());
	}
	
	System.out.println("_".repeat(50));
	
	result = account.depoites(1000);
	if(result) {
		System.out.println("Tansaction Successfully completed");
		System.out.println("Balance ::"+account.getBalance());
	}
	else {
		System.out.println("failed transaction");
		System.out.println("Balance ::"+account.getBalance());

	}
}
}
