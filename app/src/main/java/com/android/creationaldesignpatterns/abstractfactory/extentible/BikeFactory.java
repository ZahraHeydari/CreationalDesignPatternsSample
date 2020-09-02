package com.android.creationaldesignpatterns.abstractfactory.extentible;

public abstract class BikeFactory{

    abstract BikePart create(String type);
}