/*
 * Project: BankAccount.java
 * Description: This is a bank account class
 * Author: Seunghoon Park
 * Date: 1 October, 2015
 */
public class BankAccount {
	private double balance; // amount of money in the account
	String name; // the person who owns the account
	int accPass;
	public BankAccount() {
		balance = 0;
		name = "Dark Templar";
		accPass = 123456;
	}
	public BankAccount(String person, double dollars) {
		this.balance = dollars;
		this.name = person;
		this.accPass = 123456;
	}
	public void setPassword(int newPass) {
		this.accPass = newPass;
	}
	public void deposit(double amt) {
		this.balance += amt;
	}
	public void withdraw(double amt) {
		this.balance -= amt;
	}
	public double getBalance() {
		return balance;
	}
	public int getBalance(int password) {
		if(accPass == password) {
			System.out.println("Account balance: " + balance);
		}
		else {
			System.out.println("Incorrect password.");
		}
		return 0;
	}
}