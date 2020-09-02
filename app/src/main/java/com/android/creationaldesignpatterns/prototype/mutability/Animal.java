package com.android.creationaldesignpatterns.prototype.mutability;

public class Animal {

    public static void createCatCopy(){

        Cat cat = new Cat();
        cat.setOwner(new Owner("Harry"));
        Cat catCopy = cat.clone();
        System.out.println("Name of first cat: "+ cat.getOwner().getName());
        System.out.println("Name of second cat: "+ cat.getOwner().getName());

        catCopy.getOwner().setName("Lily");
        System.out.println(cat.getOwner().getName());
        System.out.println(cat.getOwner().getName());
    }

}