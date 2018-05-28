package com.pranay.incometax.api;

/**
 * 
 * @author Pranay.Jain
 * Abstract class for income tax calculator.
 * Different countries must extends this class and implement abstract methods
 */
public abstract class TaxSys {

	private long income;
	
	public TaxSys(long income){
		this.income = income;
	}
	
	public long getIncome() {
		return income;
	}

	public abstract long calculateTax();
	
	public abstract long getTaxableAmount();
	
	public abstract long getTotalExemption();
	
	public abstract void generateTaxReport();
}
