package com.Ank.Client;

import com.Ank.Application.MMBankFactory;
import com.Ank.Application.MMCurrentAcc;
import com.Ank.Application.MMSavingsAcc;
import com.Ank.Framework.Bankfactory;
import com.Ank.Framework.CurrentAcc;
import com.Ank.Framework.SavingsAcc;

public class Client {

	public static void main(String[] args) {
		Bankfactory bf = new MMBankFactory();
		
		SavingsAcc sa = new MMSavingsAcc(1, "Ankesh", 85000, true);
		CurrentAcc ca = new MMCurrentAcc(2, "Ankesh Gupta", 450000, 1000000);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		

	}

}
