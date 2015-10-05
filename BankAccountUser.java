/*
 * Project: BankAccountUser.java
 * Description: This is a bank account user class
 * Author: Seunghoon Park
 * Date: 1 October, 2015
 */
import java.util.Scanner;
public class BankAccountUser {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double money;
		String name;
		int password;
		double x, y;
		// initial money should be $1000
		System.out.println("Enter the name of the account owner: ");
		name = scan.nextLine();
		System.out.println("Enter the amount of money in account: ");
		money = scan.nextDouble();
		BankAccount b1 = new BankAccount(name, money);
		// deposits
		System.out.println("Enter the amount to deposit: ");
		x = scan.nextDouble();
		b1.deposit(x);
		System.out.println("Check balance? What is the password?");
		password = scan.nextInt();
		System.out.println(b1.getBalance(password));
		// changes pw
		System.out.println("Please change your password: ");
		password = scan.nextInt();
		b1.setPassword(password);
		System.out.println("Check balance? What is the password?");
		password = scan.nextInt();
		System.out.println(b1.getBalance(password));
	}
}