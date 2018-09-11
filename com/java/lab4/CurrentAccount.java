package com.java.lab4;

public class CurrentAccount extends Account{

	private final long overdraft = 500l;

	@Override
	public void withdrow(double amount) {
		// TODO Auto-generated method stub
		double newBalance = this.getBalance() - amount;
		if (newBalance >= 0 || (newBalance < 0 && -newBalance < overdraft)) super.withdrow(amount);
	}
}
