package com.android.creationaldesignpatterns.abstractfactory.extentible;

public class RoadBikeTire extends Tire {

    private static final String width = "NARROW";

    @Override
    public void getDescription(){
        System.out.println("Road Bike Tire. Width: " + width);
    }
}