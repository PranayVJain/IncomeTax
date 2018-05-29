package com.pranay.incometax.country;

import com.pranay.incometax.api.TaxSys;

/**
 * Indian Tax System
 * @author Pranay.Jain
 *
 */
public class IndianTaxSys extends TaxSys{

	private static final long FIRST_BRACKET = 100000;
	private static final long SECOND_BRACKET = 500000;
	public IndianTaxSys(long income) {
		super(income);
	}

	@Override
	protected long calculateTaxAmount() {
		long totalTax=0;
		long taxableAmount=getTaxableIncome();
		if(taxableAmount>FIRST_BRACKET){
			totalTax = (long) (totalTax + (taxableAmount - FIRST_BRACKET)*0.2);
			taxableAmount = FIRST_BRACKET;
		}
		if(taxableAmount>SECOND_BRACKET && taxableAmount<=FIRST_BRACKET){
			totalTax = (long) (totalTax + (taxableAmount - SECOND_BRACKET)*0.1);
			taxableAmount = SECOND_BRACKET;
		}
		return totalTax;
	}

	@Override
	protected long taxExemption() {
		return 250000;
	}

}
