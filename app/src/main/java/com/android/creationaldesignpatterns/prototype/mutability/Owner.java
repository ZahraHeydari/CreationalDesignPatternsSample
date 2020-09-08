package com.android.creationaldesignpatterns.prototype.mutability;

import org.jetbrains.annotations.NotNull;

public class Owner implements Cloneable {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*
     * Fix the problem of changing the value of this class`s attributes
     * when it`s declared as an attribute in another class and used by its shallow
     * */
    @NotNull
    @Override
    public Owner clone() {
        try {
            return (Owner) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}