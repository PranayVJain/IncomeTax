package com.pranay.incometax.country;

import com.pranay.incometax.api.Country;
import com.pranay.incometax.api.TaxSys;

/**
 * Australian Tax System
 * @author Pranay.Jain
 *
 */
public class AustralianTaxSys extends TaxSys{

	public AustralianTaxSys(long income) {
		super(income,Country.AUSTRALIA);
	}

	@Override
	protected long taxExemption() {
		// TODO Auto-generated method stub
		return 300000;
	}
	
}
