package com.android.creationaldesignpatterns.prototype.simple;

import org.jetbrains.annotations.NotNull;

public class Cat implements Cloneable {

    public enum Breed {
        RAGDOLL,
        PERSIAN,
        BIRMAN,
        DEVON_REX,
        KORUT,
        BRITISH
    }

    //Age in months
    private int age;
    private Breed breed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }


    @NotNull
    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}