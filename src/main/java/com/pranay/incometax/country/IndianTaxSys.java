package com.pranay.incometax.country;

import com.pranay.incometax.api.Country;
import com.pranay.incometax.api.TaxSys;

/**
 * Indian Tax System
 * @author Pranay.Jain
 *
 */
public class IndianTaxSys extends TaxSys{

	public IndianTaxSys(long income) {
		super(income,Country.INDIA);
	}

	@Override
	protected long taxExemption() {
		return 250000;
	}

}
