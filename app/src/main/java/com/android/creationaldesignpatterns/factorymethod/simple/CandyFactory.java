package com.android.creationaldesignpatterns.factorymethod.simple;

import java.util.ArrayList;

public class CandyFactory{

    public Candy getCandy(String type){
        switch(type){
            case "hard candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }

    public ArrayList<Candy> getCandyPackage(int quantity, String type){
        Candy candy = getCandy(type);
        ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}