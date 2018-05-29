package com.pranay.incometax;

import com.pranay.incometax.api.TaxSys;
import com.pranay.incometax.api.TaxSysFactory;

public class IncomeTaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaxSysFactory taxFactory = new TaxSysFactory();
		TaxSys taxSys= taxFactory.getTaxSystemByCountry("INDIA", 500000);
		taxSys.calculateTax();
	}

}
