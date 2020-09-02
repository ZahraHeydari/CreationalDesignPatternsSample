package com.android.creationaldesignpatterns.builder.complete;

public class Kitchen{

    private int wallColor;
    private int floorColor;
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private int numberOfSinks;


    public Kitchen(int wallColor, int floorColor, int ceilingHeight, int floorNumber, int numberOfWindows, int numberOfDoors, int numberOfSinks) {
        this.wallColor = wallColor;
        this.floorColor = floorColor;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSinks = numberOfSinks;
    }
}