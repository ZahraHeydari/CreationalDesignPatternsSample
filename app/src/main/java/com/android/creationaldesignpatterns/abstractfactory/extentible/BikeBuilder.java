package com.android.creationaldesignpatterns.abstractfactory.extentible;

public class BikeBuilder {

    public static void createBike() {

        createBikeWithExtentibleAbstractFactory("montain bike");

    }

    private static void createBikeWithExtentibleAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = (Tire) bikeFactory.create("tire");
        tireFront.getDescription();
        Tire tireBack = (Tire) bikeFactory.create("tire");
        tireBack.getDescription();
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");
        handlebar.getDescription();

    }
}