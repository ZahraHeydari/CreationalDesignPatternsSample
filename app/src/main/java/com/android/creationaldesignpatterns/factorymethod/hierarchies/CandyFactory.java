package com.android.creationaldesignpatterns.factorymethod.hierarchies;

import java.util.ArrayList;

public class CandyFactory {

    public Candy getCandy(String type) {
        switch (type) {
            case "white":
                return new Chocolate_White();
            case "dark":
                return new Chocolate_Dark();
            case "milk":
                return new Chocolate_Milk();
            case "candy cane":
                return new HardCandy_CandyCane();
            case "lollipop":
                return new HardCandy_Lollipop();
            case "peppermint":
                return new HardCandy_Peppermint();
            default:
                return null;
        }
    }

    public ArrayList<Candy> getCandyPackage(int quantity, String type, String section) {
        Candy candy = getCandy(type);

        if (section.equalsIgnoreCase("hard candy")) {
            if (quantity % 10 != 0) {
                System.out.print("Hard Candy must be packaged in multiples of 10.");
                return null;
            }
        }

        ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}