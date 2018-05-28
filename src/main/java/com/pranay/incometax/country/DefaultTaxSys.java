package com.pranay.incometax.country;

import com.pranay.incometax.api.TaxSys;

/**
 * Default Tax System
 * @author Pranay.Jain
 *
 */
public class DefaultTaxSys extends TaxSys{

	public DefaultTaxSys(long income) {
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
