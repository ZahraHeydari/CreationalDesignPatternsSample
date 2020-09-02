package com.android.creationaldesignpatterns.abstractfactory.extentible;

public class MontainBikeTire extends Tire {

    private static final String width = "WIDE";

    private static final String pressure = "MEDIUM";

    @Override
    public void getDescription(){
        System.out.println("Montain Bike Tire. Width: " + width + " Pressure: " + pressure);
    }
}