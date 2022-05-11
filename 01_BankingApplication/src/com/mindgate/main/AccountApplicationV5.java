package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountApplicationV5 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		String continueChoice;
		int transactionChoice;
		int ammount;
		boolean result;
		boolean isSalary;

		System.out.println("Welcome to the XYZ Bank");
		System.out.println("-".repeat(50));
		System.out.println("Enter Account Number ::");
		Scanner scanner = new Scanner(System.in);
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name ::");
		name = scanner.next();
		System.out.println("Enter Balance ::");
		balance = scanner.nextDouble();
		
		
		System.out.println("Do u want to open salary account? true or false");
		isSalary= scanner.nextBoolean();

		Account account = new Savings(accountNumber, name, balance, isSalary);

		System.out.println("Account Opened Sucessfully");

		do {
			System.out.println("MENU \n 1. Withdraw  \n 2.Deposit \n 3. Check Balance\n");
			System.out.println("Enter Your Choice");
			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {

			case 1:
				System.out.println("Enter Withdraw Ammount");
				ammount = scanner.nextInt();
				result = account.withdraw(ammount);
				if (result) {
					System.out.println("Withdaw Completeed Successfuly ");
					System.out.println("Balance :: " + account.getBalance());
				} else {

					System.out.println("Withdaw Failed ");
					System.out.println("Balance :: " + account.getBalance());

				}
				break;

			case 2:
				System.out.println("Enter Ammount to be Deposit");
				ammount = scanner.nextInt();
				result = account.depoites(ammount);
				if (result) {
					System.out.println("Deposit Completeed Successfuly ");
					System.out.println("Balance :: " + account.getBalance());
				} else {

					System.out.println("Deposit Failed ");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;

			case 3:
				System.out.println("Balance :: " + account.getBalance());
				break;

			default:
				System.out.println("Unexpected value: " + transactionChoice);
			}
			System.out.println("Do you want to continune \n (Yes/No)");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes"));
		System.out.println("Thank You for Banking with us");

	}
}
