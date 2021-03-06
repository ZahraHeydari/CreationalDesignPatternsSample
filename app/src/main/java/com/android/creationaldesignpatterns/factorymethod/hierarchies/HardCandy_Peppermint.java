package com.android.creationaldesignpatterns.factorymethod.hierarchies;

import java.util.ArrayList;

public class HardCandy_Peppermint extends Candy{

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity){

        ArrayList<Candy> hardCandyPackage = new ArrayList<>();
        for(int i=0 ; i < quantity ; i++){
            HardCandy_Peppermint hardCandy = new HardCandy_Peppermint();
            hardCandyPackage.add(hardCandy);
        }
        System.out.println(quantity + " of 10 candy canes have been made!");
        return hardCandyPackage;
    }

}