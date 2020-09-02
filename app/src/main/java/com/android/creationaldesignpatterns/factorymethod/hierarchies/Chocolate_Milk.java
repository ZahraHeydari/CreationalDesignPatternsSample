package com.android.creationaldesignpatterns.factorymethod.hierarchies;

import java.util.ArrayList;

public class Chocolate_Milk extends Candy{

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity){

        ArrayList<Candy> chocolatePackage = new ArrayList<>();
        for(int i=0 ; i < quantity ; i++){
            Chocolate_Milk chocolate = new Chocolate_Milk();
            chocolatePackage.add(chocolate);
        }
        System.out.println("One package of "+ quantity + " chocolates has been made!");
        return chocolatePackage;
    }

}