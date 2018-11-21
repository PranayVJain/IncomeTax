package com.pranay.incometax.bracket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pranay.incometax.api.Country;

/**
 * Singleton Class to set the Bracket system for each country.
 * Input should ideally come from config file which can be updated easily
 * @author Pranay.Jain
 *
 */
public class Bracket {

	public static Map<Country,List<BracketModel>> brackets;
	private static Bracket bracket = new Bracket();
	private Bracket(){
		
	}
	
	public Bracket getInstance(){
		return bracket;
	}
	
	public static void init(){
		brackets = new HashMap<Country, List<BracketModel>>();
		brackets.put(Country.INDIA, getIndianBracketModel());
	}
	
	private static List<BracketModel> getIndianBracketModel(){
		List<BracketModel> model = new ArrayList<BracketModel>();
		model.add(new BracketModel(0.2,1000000));
		model.add(new BracketModel(0.1,500000));
		model.add(new BracketModel(0.05,250000));
		return model;
	}

	public static Map<Country, List<BracketModel>> getBrackets() {
		return brackets;
	}
	
}
