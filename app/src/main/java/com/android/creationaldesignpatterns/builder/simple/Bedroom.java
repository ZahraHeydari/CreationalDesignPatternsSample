package com.android.creationaldesignpatterns.builder.simple;


public class Bedroom {

    private int wallColor;
    private int floorColor;
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Bedroom(int wallColor, int floorColor, int ceilingHeight, int floorNumber,
                   int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.wallColor = wallColor;
        this.floorColor = floorColor;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "wallColor=" + wallColor +
                ", floorColor=" + floorColor +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", isDouble=" + isDouble +
                ", hasEnsuite=" + hasEnsuite +
                '}';
    }
}