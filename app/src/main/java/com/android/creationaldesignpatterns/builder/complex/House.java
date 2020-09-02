package com.android.creationaldesignpatterns.builder.complex;

import java.util.ArrayList;

public class House{

    private ArrayList<Room> listOfRooms;

    public House(ArrayList<Room> listOfRooms){
        this.listOfRooms = listOfRooms;
    }


    @Override
    public String toString() {
        return "House{" +
                "listOfRooms=" + listOfRooms +
                '}';
    }
}