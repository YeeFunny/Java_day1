package com.java.lab4;

public class SavingAccount extends Account{

	private final long miniBalance = 500l;

	@Override
	public void withdrow(double amount) {
		// TODO Auto-generated method stub
		if (this.getBalance() - amount >= miniBalance)
			super.withdrow(amount);
	}
}
