package com.Ank.Framework;

public abstract class Bankfactory {
	public abstract SavingsAcc getNewSavingsAccount(int AccNo,String accNm,float accBal,boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal, float creditLimit);
	

}
