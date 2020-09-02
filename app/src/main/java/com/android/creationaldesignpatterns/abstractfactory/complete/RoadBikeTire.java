package com.android.creationaldesignpatterns.abstractfactory.complete;

public class RoadBikeTire extends Tire{

    private static final String width = "NARROW";

    @Override
    public void getDescription(){
        System.out.print("Road Bike Tire. Width: " + width);
    }
}