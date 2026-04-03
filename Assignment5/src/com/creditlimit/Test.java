package com.creditlimit;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter balance at the beginning of the month: ");
		int beginningBalance = sc.nextInt();

		System.out.print("Enter total of all items charged by the customer this month: ");
		int totalCharges = sc.nextInt();

		System.out.print("Enter total of all credits applied to the customer’s account this month: ");
		int totalCredits = sc.nextInt();

		System.out.print("Enter allowed credit limit: ");
		int creditLimit = sc.nextInt();

		Customer c = new Customer(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);
		System.out.println("New Balance: " + c.calculateNewBalance());
		c.checkCreditLimit();
		
		sc.close();

	}

}
