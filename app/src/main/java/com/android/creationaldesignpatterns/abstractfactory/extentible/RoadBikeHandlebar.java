package com.android.creationaldesignpatterns.abstractfactory.extentible;

public class RoadBikeHandlebar extends Handlebar {

    private static final String type = "DROP";


    @Override
    public void getDescription(){
        System.out.println("Road Bike Handlebar. Type: " + type );
    }
}