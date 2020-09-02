package com.android.creationaldesignpatterns.builder.simple;


import android.graphics.Color;

public class Architect {


    public static void buildBedroom(){

        Bedroom room = new Bedroom(Color.WHITE, Color.GRAY, 130, 2, 3, 1, true, true);

        //Bedroom room = new BedroomBuilder().setWallColor(Color.WHITE).createBedroom();

        System.out.println("Bedroom: "+ room.toString());
    }


}