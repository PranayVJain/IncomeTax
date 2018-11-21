package com.pranay.incometax.bracket;

public class BracketModel {

	private final double bracketPercentage;
	private final long bracketAmt;
	
	public BracketModel(double bracketPercentage, long bracketAmt) {
		super();
		this.bracketPercentage = bracketPercentage;
		this.bracketAmt = bracketAmt;
	}

	public double getBracketPercentage() {
		return bracketPercentage;
	}

	public long getBracketAmt() {
		return bracketAmt;
	}
	
}
