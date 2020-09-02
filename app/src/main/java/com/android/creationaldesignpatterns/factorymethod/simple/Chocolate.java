package com.android.creationaldesignpatterns.factorymethod.simple;

import java.util.ArrayList;

public class Chocolate extends Candy{

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity){

        ArrayList<Candy> chocolatePackage = new ArrayList<>();
        for(int i=0 ; i < quantity ; i++){
            Chocolate chocolate = new Chocolate();
            chocolatePackage.add(chocolate);
        }
        System.out.print("One package of "+ quantity + " chocolates has been made!");
        return chocolatePackage;
    }

}