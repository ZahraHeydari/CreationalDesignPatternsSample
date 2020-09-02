package com.android.creationaldesignpatterns.factorymethod.full;

import java.util.ArrayList;

public class HardCandy_Lollipop extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity){

        ArrayList<Candy> hardCandyPackage = new ArrayList<>();
        for(int i=0 ; i < quantity ; i++){
            HardCandy_Lollipop hardCandy = new HardCandy_Lollipop();
            hardCandyPackage.add(hardCandy);
        }
        return hardCandyPackage;
    }

}
