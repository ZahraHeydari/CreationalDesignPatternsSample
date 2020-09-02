package com.android.creationaldesignpatterns.abstractfactory.complete;

public class BikeBuilder{

    public static void createBike(){

        createBikeWithoutAbstractFactory();

        createBikeWithAbstractFactory("montain bike");
    }


    public static void createBikeWithoutAbstractFactory(){

        MontainBikeTire montainBikeTireBack = new MontainBikeTire();
        MontainBikeTire montainBikeTireFront = new MontainBikeTire();
        MontainBikeHandlebar montainBikeHandlebar = new MontainBikeHandlebar();
        montainBikeTireBack.getDescription();
        montainBikeTireFront.getDescription();
        montainBikeHandlebar.getDescription();
        System.out.println();
    }

    public static void createBikeWithAbstractFactory(String type){
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        Handlebar handlebar = bikeFactory.createHandlebar();
        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();
        System.out.println();

    }
}