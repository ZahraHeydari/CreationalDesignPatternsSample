package com.android.creationaldesignpatterns.abstractfactory.complete;

public abstract class BikeFactory{

    abstract Tire createTire();

    abstract Handlebar createHandlebar();
}