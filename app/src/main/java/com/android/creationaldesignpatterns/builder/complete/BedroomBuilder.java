package com.android.creationaldesignpatterns.builder.complete;

import com.android.creationaldesignpatterns.builder.simple.Bedroom;

public class BedroomBuilder {

    private int wallColor;
    private int floorColor;
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;


    public BedroomBuilder() {

    }

    public BedroomBuilder setWallColor(int wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public BedroomBuilder setFloorColor(int floorColor) {
        this.floorColor = floorColor;
        return this;
    }

    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public BedroomBuilder setIsDouble(boolean isDouble) {
        this.isDouble = isDouble;
        return this;
    }

    public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        return this;
    }

    public Bedroom createBedroom() {
        return new Bedroom(wallColor, floorColor, ceilingHeight, floorNumber, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }
}