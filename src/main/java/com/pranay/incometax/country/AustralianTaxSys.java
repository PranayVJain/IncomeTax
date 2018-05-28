package com.pranay.incometax.country;

import com.pranay.incometax.api.TaxSys;

/**
 * Australian Tax System
 * @author Pranay.Jain
 *
 */
public class AustralianTaxSys extends TaxSys{

	public AustralianTaxSys(long income) {
		super(income);
	}

	@Override
	public long calculateTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getTaxableAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getTotalExemption() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void generateTaxReport() {
		// TODO Auto-generated method stub
		
	}
	
}
