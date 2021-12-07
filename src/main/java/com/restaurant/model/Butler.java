package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Butler extends Person {

    private List<Room> ownedRooms = new ArrayList<Room>();
    private List<Waiter> waiters = new ArrayList<Waiter>();

    public Butler(String name, String firstName){
        super(name, firstName);
    }

    public void assignTablesToAllWaiters(){
        
    }
}
