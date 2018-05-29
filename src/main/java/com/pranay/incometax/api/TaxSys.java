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
	
	public void calculateTax(){
		long taxAmount = calculateTaxAmount();
		generateTaxReport(taxAmount);
	}
	
	protected abstract long calculateTaxAmount();
	
	protected long getTaxableIncome(){
		long taxableAmount =0;
		if(getIncome()>taxExemption()){
			taxableAmount = getIncome() - taxExemption();
		}
		return taxableAmount;
	}
	
	protected abstract long taxExemption();
	private void generateTaxReport(long taxAmount){
		System.out.println("********Tax Report************");
		System.out.println("Total Income		:" + getIncome());
		System.out.println("Total Tax Exemption	:" + taxExemption());
		System.out.println("Total Taxable Income	:" + getTaxableIncome());
		System.out.println("Total Tax      		:" + taxAmount);
		System.out.println("Education Cess 		:" + taxAmount*0.001);
		System.out.println("Swachh Bharat Cess 	:" + taxAmount*0.001);
		System.out.println("Total Tax Liability 	:" + (taxAmount + 2*(0.001)*taxAmount));
		System.out.println("********Tax Report************");
	}

	public long getIncome() {
		return income;
	}
	
}
