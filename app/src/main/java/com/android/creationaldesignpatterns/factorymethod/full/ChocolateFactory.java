package com.android.creationaldesignpatterns.factorymethod.full;

public class ChocolateFactory extends CandyFactory{

    public Candy getCandy(String type){
        switch(type){
            case "white":
                return new Chocolate_White();
            case "dark":
                return new Chocolate_Dark();
            case "milk":
                return new Chocolate_Milk();
            default:
                return null;
        }
    }
}