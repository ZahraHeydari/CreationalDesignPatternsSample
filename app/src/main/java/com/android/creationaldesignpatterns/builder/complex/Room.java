package com.android.creationaldesignpatterns.builder.complex;


public class Room {

    private int wallColor;
    private int floorColor;
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Room(int wallColor, int floorColor, int ceilingHeight, int floorNumber,
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
        return "Room{" +
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