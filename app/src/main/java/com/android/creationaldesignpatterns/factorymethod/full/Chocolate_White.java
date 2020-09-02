package com.android.creationaldesignpatterns.factorymethod.full;

import java.util.ArrayList;

public class Chocolate_White extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity){

        ArrayList<Candy> chocolatePackage = new ArrayList<>();
        for(int i=0 ; i < quantity ; i++){
            Chocolate_White chocolate = new Chocolate_White();
            chocolatePackage.add(chocolate);
        }
        System.out.println("One package of "+ quantity + " chocolates has been made!");
        return chocolatePackage;
    }

}