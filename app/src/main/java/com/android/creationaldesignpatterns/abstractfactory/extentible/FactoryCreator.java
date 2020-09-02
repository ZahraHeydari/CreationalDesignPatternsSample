package com.android.creationaldesignpatterns.abstractfactory.extentible;

public class FactoryCreator{


    public static BikeFactory createFactory(String type){
        if(type.equalsIgnoreCase("montain bike")){
            return new MontainBikeFactory();
        }else if(type.equalsIgnoreCase("road bike")){
            return new RoadBikeFactory();
        }else{
            System.out.println("Pleas specify a valid type.");
            return null;
        }
    }

}