package com.restaurant.model;

public class Customer {
    private String id;
    private static int internalId = 1;

    public Customer(){
        this.id = "customer_" + internalId;
    }

    public void orderToWaiter(){

    }

    {
        internalId++;
    }

}
