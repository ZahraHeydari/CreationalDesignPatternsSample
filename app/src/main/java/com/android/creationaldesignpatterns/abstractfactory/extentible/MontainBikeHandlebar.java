package com.android.creationaldesignpatterns.abstractfactory.extentible;

public class MontainBikeHandlebar extends Handlebar {

    private static final String type = "FLAT";


    @Override
    public void getDescription(){
        System.out.println("Montain Bike Handlebar. Type: " + type );
    }
}