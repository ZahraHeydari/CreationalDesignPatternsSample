package com.android.creationaldesignpatterns.abstractfactory.complete;

public class MontainBikeHandlebar extends Handlebar{

    private static final String type = "FLAT";


    @Override
    public void getDescription(){
        System.out.print("Montain Bike Handlebar. Type: " + type );
    }
}