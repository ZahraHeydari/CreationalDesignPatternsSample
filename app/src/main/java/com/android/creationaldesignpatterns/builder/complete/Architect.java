package com.android.creationaldesignpatterns.builder.complete;


import android.graphics.Color;

import com.android.creationaldesignpatterns.builder.simple.Bedroom;

public class Architect {


    public static void buildBedrooms() {

        Bedroom room1 = new BedroomBuilder().setWallColor(Color.WHITE).setCeilingHeight(3).createBedroom();
        System.out.println("Room1 : " + room1);
        Bedroom room2 = new BedroomBuilder().setWallColor(Color.WHITE).createBedroom();
        System.out.println("Room2 : " + room2);
    }
}
