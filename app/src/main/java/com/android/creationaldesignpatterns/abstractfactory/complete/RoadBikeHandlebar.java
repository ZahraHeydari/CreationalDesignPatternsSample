package com.android.creationaldesignpatterns.abstractfactory.complete;

public class RoadBikeHandlebar extends Handlebar{

    private static final String type = "DROP";


    @Override
    public void getDescription(){
        System.out.print("Road Bike Handlebar. Type: " + type );
    }
}