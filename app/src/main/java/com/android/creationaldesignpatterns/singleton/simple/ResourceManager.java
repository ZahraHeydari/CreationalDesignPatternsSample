package com.android.creationaldesignpatterns.singleton.simple;

public class ResourceManager{

    //Printer printer = new Printer();//generates an error because of private constructor
    Printer printer = Printer.getInstance();
}