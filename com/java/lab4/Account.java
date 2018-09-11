package com.java.lab4;

public class Account {
	
	private static long noOfAcc;
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account() {
		this.accNum = ++noOfAcc;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdrow(double amount) {
		this.balance -= amount;
	}
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
}
