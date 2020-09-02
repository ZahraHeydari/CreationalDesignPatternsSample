package com.android.creationaldesignpatterns.singleton.concurrencycontrolling;

public class Printer{

    private static Printer printer;
    //private static final Printer printer = new Printer();//lazy initialization

    private static boolean initialized = false;

    private Printer(){

    }

    private void init(){
        // code to initialize our printer goes here
    }

    public static Printer getInstance(){
        if(initialized) return printer;
        printer = new Printer();
        printer.init();
        initialized = true;
        return printer;
    }

}