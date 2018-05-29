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
	protected long calculateTaxAmount() {
		return 0;
	}

	@Override
	protected long taxExemption() {
		// TODO Auto-generated method stub
		return 250000;
	}
	
}
