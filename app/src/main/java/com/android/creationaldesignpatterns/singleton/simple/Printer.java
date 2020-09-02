package com.android.creationaldesignpatterns.singleton.simple;

public class Printer{

    private static Printer printer;

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