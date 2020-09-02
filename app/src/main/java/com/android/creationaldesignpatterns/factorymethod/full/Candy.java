package com.android.creationaldesignpatterns.factorymethod.full;

import java.util.ArrayList;

public abstract class Candy{

    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}