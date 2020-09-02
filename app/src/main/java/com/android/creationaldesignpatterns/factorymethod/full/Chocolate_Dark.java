package com.android.creationaldesignpatterns.factorymethod.full;

import java.util.ArrayList;

public class Chocolate_Dark extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity){

        ArrayList<Candy> chocolatePackage = new ArrayList<>();
        for(int i=0 ; i < quantity ; i++){
            Chocolate_Dark chocolate = new Chocolate_Dark();
            chocolatePackage.add(chocolate);
        }
        System.out.println("One package of "+ quantity + " chocolates has been made!");
        return chocolatePackage;
    }

}