package com.example.initializeObject;

//Creating a test class to deposit and withdraw amount
public class TestAccount {

	public static void main(String[] args) {
		AccountExample account = new AccountExample();
		account.insert(832345, "Mathu", 1000);
		account.display();
		account.checkBalance();
		account.deposit(40000);
		account.checkBalance();
		account.withdraw(15000);
		account.checkBalance();

	}

}
