package com.pranay.incometax.api;

/**
 * List of countries for which tax calculator is available
 * @author Pranay.Jain
 *
 */
public enum Country {

	INDIA("INDIA"),AUSTRALIA("AUSTRALIA"),DEFAULT("DEFAULT");
	private final String country;	
	private Country(String country){
		this.country = country;
	}
	
	
	public static Country getCountry(String val){
		Country country = Country.DEFAULT;
		for(Country c:Country.values()){
			if(val.equalsIgnoreCase(c.name())){
				country = c;
				break;
			}
		}
		return country;
	}


	public String getCountry() {
		return country;
	}
	
}
