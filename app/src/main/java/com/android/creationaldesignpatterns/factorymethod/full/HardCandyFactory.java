package com.android.creationaldesignpatterns.factorymethod.full;

public class HardCandyFactory extends CandyFactory{


    public Candy getCandy(String type){
        switch(type){
            case "candy cane":
                return new HardCandy_CandyCane();
            case "lollipop":
                return new HardCandy_Lollipop();
            case "peppermint":
                return new HardCandy_Peppermint();
            default:
                return null;
        }
    }
}