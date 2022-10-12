package day11_12OOPS;

import java.util.Scanner;

public class Account {
	static Scanner scanner = new Scanner(System.in);
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void debit(double balance) {
		System.out.println("enter ammount to withdraw");
		double withdraw = scanner.nextDouble();
		if (withdraw <= balance && withdraw>0) {
			double finalBalance = (balance - withdraw);
			System.out.println("Final balance is : " + finalBalance);
		} 
		else if (withdraw <0)
			System.out.println("Invalid Amount..");
		else 
			System.out.println("Insufficient Balance");
	}
	public static void main(String[] args) {
		System.out.println("Enter the balance to mention in the account");
		Account account = new Account(scanner.nextDouble());
		account.debit(account.balance);
	}

}
