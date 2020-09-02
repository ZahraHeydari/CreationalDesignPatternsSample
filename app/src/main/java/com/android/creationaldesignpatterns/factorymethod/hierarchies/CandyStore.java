package com.android.creationaldesignpatterns.factorymethod.hierarchies;

public class CandyStore{

    private static final CandyFactory candyFactory = new CandyFactory();

	public static void createCandies(){

		candyFactory.getCandyPackage(12, "white", "Chocolate");
		candyFactory.getCandyPackage(7, "dark", "Chocolate");
		candyFactory.getCandyPackage(14, "lollipop", "HardCandy");
		candyFactory.getCandyPackage(20, "peppermint", "HardCandy");
	}
}