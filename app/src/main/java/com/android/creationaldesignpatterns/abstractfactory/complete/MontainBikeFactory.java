package com.android.creationaldesignpatterns.abstractfactory.complete;

public class MontainBikeFactory extends BikeFactory{

    @Override
    public Tire createTire(){
        return new MontainBikeTire();
    }

    @Override
    public Handlebar createHandlebar(){
        return new MontainBikeHandlebar();
    }


}