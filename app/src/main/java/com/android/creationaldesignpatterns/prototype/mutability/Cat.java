package com.android.creationaldesignpatterns.prototype.mutability;

import org.jetbrains.annotations.NotNull;

public class Cat implements Cloneable {

    public enum Breed{
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
    private Owner owner;

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

    public Owner getOwner() {
        return owner;
    }


    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    @NotNull
    @Override
    public Cat clone(){
        try{
            Cat cat = (Cat) super.clone();

            // Create a new object for the field owner and assign it to shallow copy obtained to make it a deep copy
            this.owner = owner.clone();

            return cat;
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}