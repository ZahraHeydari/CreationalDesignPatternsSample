package com.android.creationaldesignpatterns.singleton.simple;

/**
 * Classic Java Singleton pattern
 * */
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



/**
 * Double-checked locking with volatile keyword
 */
/*public class Printer {

    private volatile static Printer printer;

    private Printer() {

    }

    private void init() {
        // code to initialize our printer goes here
    }

    public static Printer getInstance() {
        if (printer == null) {
            synchronized (Printer.class) {
                if (printer == null) {
                    printer = new Printer();
                    printer.init();
                }
            }
        }
        return printer;
    }

}*/




