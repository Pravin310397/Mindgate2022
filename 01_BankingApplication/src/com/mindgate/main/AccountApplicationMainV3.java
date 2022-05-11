package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {
	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank");

		Scanner scanner = new Scanner(System.in);
		int accountnumber;
		String name;
		double balance;
		String continuechoice;

		System.out.println("Enter Account number");
		accountnumber = scanner.nextInt();

		System.out.println("Enter name ");
		name = scanner.next();

		System.out.println("Enter Balance ");
		balance = scanner.nextDouble();

		Account account = new Account(accountnumber, name, balance);

		System.out.println("Account Open Successfully");

		do {
			System.out.println("1) Withdraw \n 2) Deposite \n 3) Check Balance 4) Cancel \n Enter your Choice ");
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter Withdraw amount");
				int amount = scanner.nextInt();
				boolean result = account.withdraw(amount);
				if (result) {
					System.out.println("Transaction Completed Successfully");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;

			case 2:
				System.out.println("Enter Deposite Amount ");
				amount = scanner.nextInt();
				result = account.depoites(amount);
				if (result) {
					System.out.println("Transaction Completed Successfully");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction Failed ");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;

			case 3:
				System.out.println("Your Bank Balanace is : " + account.getBalance());
				break;
			case 4:
				System.exit(0);

			default:
				System.out.println("You Enter Wrong Choice ");
			}
			System.out.println("Do you want to Continue ?");
			continuechoice = scanner.next();

		} while (continuechoice.equals("yes"));

		System.out.println("Thank You for banking with us!");
	}
}
