package com.android.creationaldesignpatterns.factorymethod.simple;

import java.util.ArrayList;

public class HardCandy extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {

        ArrayList<Candy> hardCandyPackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            HardCandy hardCandy = new HardCandy();
            hardCandyPackage.add(hardCandy);
        }
        System.out.print(quantity + "of 10 candy canes have been made!");
        return hardCandyPackage;
    }

}