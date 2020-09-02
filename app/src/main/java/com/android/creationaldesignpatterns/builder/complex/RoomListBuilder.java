package com.android.creationaldesignpatterns.builder.complex;

import java.util.ArrayList;

public class RoomListBuilder{

    private ArrayList<Room> listOfRooms;

    public RoomListBuilder(){

    }

    public RoomListBuilder addList(ArrayList<Room> listOfRooms){
        this.listOfRooms = listOfRooms;
        return this;
    }

    public RoomListBuilder addRoom(Room room){
        listOfRooms.add(room);
        return this;
    }

    public RoomBuilder addRoom(){
        return new RoomBuilder(this);
    }

    public ArrayList buildList(){
        return listOfRooms;
    }

}