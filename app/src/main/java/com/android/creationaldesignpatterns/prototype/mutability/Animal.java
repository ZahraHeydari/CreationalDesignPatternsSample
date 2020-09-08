package com.android.creationaldesignpatterns.prototype.mutability;

public class Animal {

    public static void createCatCopy(){

        Cat cat = new Cat();
        cat.setOwner(new Owner("Harry"));
        Cat catCopy = cat.clone();
        System.out.println("Name of the first cat: "+ cat.getOwner().getName());
        System.out.println("Name of the second cat: "+ catCopy.getOwner().getName());


        catCopy.getOwner().setName("Lily");
        System.out.println(cat.getOwner().getName());
        System.out.println(catCopy.getOwner().getName());
    }

}