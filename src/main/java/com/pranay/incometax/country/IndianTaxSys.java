package com.pranay.incometax.country;

import com.pranay.incometax.api.TaxSys;

/**
 * Indian Tax System
 * @author Pranay.Jain
 *
 */
public class IndianTaxSys extends TaxSys{

	public IndianTaxSys(long income) {
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
