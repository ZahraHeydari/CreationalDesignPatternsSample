package com.android.creationaldesignpatterns.abstractfactory.extentible;

public class MontainBikeFactory extends BikeFactory{

    @Override
    public BikePart create(String type){
        if(type.equalsIgnoreCase("tire"))
            return new MontainBikeTire();
        else if(type.equalsIgnoreCase("handlebar"))
            return new MontainBikeHandlebar();
        else return null;
    }

}