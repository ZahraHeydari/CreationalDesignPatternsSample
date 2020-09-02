package com.android.creationaldesignpatterns.builder.complete;


public class Bedroom {

    private int wallColor;
    private int floorColor;
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean isEnsuite;

    public Bedroom(int wallColor, int floorColor, int ceilingHeight, int floorNumber,
                   int numberOfWindows, int numberOfDoors, boolean isDouble, boolean isEnsuite) {
        this.wallColor = wallColor;
        this.floorColor = floorColor;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.isEnsuite = isEnsuite;
    }
}