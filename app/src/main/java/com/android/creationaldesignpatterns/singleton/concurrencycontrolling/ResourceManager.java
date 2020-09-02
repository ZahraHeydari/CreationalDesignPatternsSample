package com.android.creationaldesignpatterns.singleton.concurrencycontrolling;

public class ResourceManager{


    public static void manageResources(){

        //Printer printer = Printer.getInstance();

        //first thread
        Thread threadOne = new Thread(() -> {Printer printer1 = Printer.getInstance();});

        //second thread
        Thread threadTwo = new Thread(() -> {Printer printer2 = Printer.getInstance();});

        threadOne.start();
        threadTwo.start();

    }

}