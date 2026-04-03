package com.creditlimit;

public class Customer {

	int accounNumber;
	int beginningBalance;
	int totalCharges;
	int totalCredits;
	int creditLimit;

	public Customer(int accounNumber, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
		this.accounNumber = accounNumber;
		this.beginningBalance = beginningBalance;
		this.totalCharges = totalCharges;
		this.totalCredits = totalCredits;
		this.creditLimit = creditLimit;
	}

	public int calculateNewBalance() {
		int newBalance = beginningBalance + totalCharges - totalCredits;
		return newBalance;
	}

	public void checkCreditLimit() {
		if (calculateNewBalance() > creditLimit) {
			System.out.println("Credit limit exceeded");
		}
	}
}
