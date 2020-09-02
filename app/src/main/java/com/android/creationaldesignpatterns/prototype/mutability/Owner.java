package com.android.creationaldesignpatterns.prototype.mutability;

public class Owner {

    private String name;

    public Owner(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*@NotNull
    @Override
    public Owner clone(){
        try{
            return (Owner) super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }*/

}