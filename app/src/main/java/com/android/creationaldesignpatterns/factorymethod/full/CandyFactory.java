package com.android.creationaldesignpatterns.factorymethod.full;

import java.util.ArrayList;

public abstract class CandyFactory{

    public abstract Candy getCandy(String type);

    public ArrayList<Candy> getCandyPackage(int quantity, String type){
        Candy candy = getCandy(type);
        ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}