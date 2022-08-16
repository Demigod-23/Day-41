package com.Ank.Framework;

public abstract class BankAcc {
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.setAccNo(accNo);
		this.setAccNm(accNm);
		this.setAccBal(accBal);
	}

	public void withdraw(float accBal) {
		System.out.println("Your balance after withdrawing is Rs."+ accBal);
	}
	
	public void deposite(float accBal) {
		System.out.println("Your balance after Deposition is Rs."+ accBal);
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
}