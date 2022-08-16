package com.Ank.Framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;
	
	
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withdraw(float accBal) {
		System.out.println("Your balance after withdrawing is Rs."+ accBal);
	}
	
	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	

}
