package com.android.creationaldesignpatterns.builder.complex;


import java.util.ArrayList;

public class Architect {


    public static void buildHouse() {

        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
        Room room2 = new RoomBuilder().setFloorNumber(1).createRoom();

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        House house = new House(rooms);
        System.out.println("House: " + house);

        //another way
   /*     ArrayList<Room> rooms = new RoomListBuilder().addList(rooms)
                .addRoom(room1)
                .addRoom(room2)
                .buildList();

        House house = new House(rooms);
        System.out.println("House: " + house);
        */


        // the best way
 /*       ArrayList<Room> rooms = new RoomListBuilder().addList(rooms)
                .addRoom().setFloorNumber(2).addRoomToList()
                .addRoom().setFloorNumber(1).addRoomToList()
                .buildList();

        House house = new House(rooms);
        System.out.println("House: " + house);
        */


    }

}