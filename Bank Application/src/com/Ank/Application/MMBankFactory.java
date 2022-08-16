package com.Ank.Application;

import com.Ank.Framework.Bankfactory;
import com.Ank.Framework.CurrentAcc;
import com.Ank.Framework.SavingsAcc;

public class MMBankFactory extends Bankfactory{

	@Override
	public SavingsAcc getNewSavingsAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingsAcc mmsaving = new MMSavingsAcc(AccNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, creditLimit, creditLimit);
		return mmcurrent;
	}

	

	
	}

