package com.pranay.incometax.api;

import com.pranay.incometax.country.AustralianTaxSys;
import com.pranay.incometax.country.DefaultTaxSys;
import com.pranay.incometax.country.IndianTaxSys;

public class TaxSysFactory {

	/**
	 * Method gets the tax system based on country name. 
	 * If invalid country name is given then default system is considered
	 * @param country
	 * @return
	 */
	public TaxSys getTaxSystemByCountry(String country,long income){
		TaxSys taxSys = null;
		switch (Country.getCountry(country)) {
		case INDIA:
			taxSys = new IndianTaxSys(income);
			break;

		case AUSTRALIA:
			taxSys = new AustralianTaxSys(income);
			break;
			
		default:
			taxSys = new DefaultTaxSys(income);
			break;
		}
		return taxSys;
	} 
}
