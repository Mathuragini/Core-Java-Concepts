package com.example.initializeObject;

public class AccountExample {

	int acc_no;
	String name;
	float amount;

	// Method to initialize object
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

	// deposit method
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println("You have deposited :" + amt);
	}

	// withdraw method
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println("Withdrawn amount is :" + amt);
		}
	}

	// method to check the balance of the account
	void checkBalance() {
		System.out.println("Now your Balance is: " + amount);
	}

	// method to display the values of an object
	void display() {
		System.out.println("Your account No :" + acc_no + " == " + "Your name is :" + name + "== " + amount);
	}
}
