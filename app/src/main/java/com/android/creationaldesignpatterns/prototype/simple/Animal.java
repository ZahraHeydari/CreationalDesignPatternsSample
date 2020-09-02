package com.android.creationaldesignpatterns.prototype.simple;

public class Animal {

    public static void createCatCopy(){
        Cat cat = new Cat();
        cat.setAge(8);
        Cat catCopy = cat.clone();
        System.out.println("Age of first cat: "+ cat.getAge());
        System.out.println("Age of second cat: "+ catCopy.getAge());
    }
}

