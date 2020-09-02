package com.android.creationaldesignpatterns.builder.complete;

public class KitchenBuilder {

    private int wallColor;
    private int floorColor;
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private int numberOfSinks;


    public KitchenBuilder() {

    }

    public KitchenBuilder setWallColor(int wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public KitchenBuilder setFloorColor(int floorColor) {
        this.floorColor = floorColor;
        return this;
    }

    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public KitchenBuilder setNumberOfSinks(int numberOfSinks) {
        this.numberOfSinks = numberOfSinks;
        return this;
    }


    public Kitchen createKitchen() {
        return new Kitchen(wallColor, floorColor, ceilingHeight, floorNumber, numberOfWindows, numberOfDoors, numberOfSinks);
    }
}
