package com.pranay.incometax.country;

import com.pranay.incometax.api.Country;
import com.pranay.incometax.api.TaxSys;

/**
 * Default Tax System
 * @author Pranay.Jain
 *
 */
public class DefaultTaxSys extends TaxSys{

	public DefaultTaxSys(long income) {
		super(income,Country.DEFAULT);
	}

	@Override
	protected long taxExemption() {
		// TODO Auto-generated method stub
		return 250000;
	}
	
}
