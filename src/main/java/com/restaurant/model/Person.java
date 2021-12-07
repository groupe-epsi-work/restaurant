package com.restaurant.model;

public abstract class Person {
    protected String name;
    protected String firstName;

    public Person(String name, String firstName){
        this.name = name;
        this.firstName = firstName;
    }

    public Person(){
        
    }
}
