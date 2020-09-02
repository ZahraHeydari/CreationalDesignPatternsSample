package com.android.creationaldesignpatterns.singleton.javaexample;

import java.util.Collections;
import java.util.List;

public class ResourceManager {


    public static void manageResources() {

        Printer printer = new Printer();

        List<Printer> printers = Collections.singletonList(printer);

        processResources(printers);

        Printer printer2 = new Printer();
        printers.add(printer2); // will generate an error

    }


    /*
     * A method that takes a list of resource managers as a parameter
     */
    public static <Type> void processResources(List<Type> list) {

        for (Type p : list) {
            //code to process resources
        }
    }


}