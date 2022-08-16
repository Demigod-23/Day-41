package com.Ank.Application;
import com.Ank.Framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc {
	
	private static final float MINBAL = 2000.0f;
	
	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	
	public void withdraw(float accBal) {
		System.out.println("Account Holder Name: "+getAccNm());
		System.out.println("Dear Saving account holder your account balance is Rs." + accBal);
		
	}

	public static float getMinbal() {
		return MINBAL;
	}



	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

	
	

}
