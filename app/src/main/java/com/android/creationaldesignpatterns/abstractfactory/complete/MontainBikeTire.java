package com.android.creationaldesignpatterns.abstractfactory.complete;

public class MontainBikeTire extends Tire{

    private static final String width = "WIDE";

    private static final String pressure = "MEDIUM";

    @Override
    public void getDescription(){
        System.out.print("Montain Bike Tire. Width: " + width + " Pressure: " + pressure);
    }
}