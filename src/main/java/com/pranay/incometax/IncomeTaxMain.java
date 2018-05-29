package com.pranay.incometax;

import com.pranay.incometax.api.TaxSys;
import com.pranay.incometax.api.TaxSysFactory;
import com.pranay.incometax.bracket.Bracket;

public class IncomeTaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bracket.init();
		TaxSysFactory taxFactory = new TaxSysFactory();
		TaxSys taxSys= taxFactory.getTaxSystemByCountry("INDIA", 760000);
		taxSys.calculateTax();
	}

}
