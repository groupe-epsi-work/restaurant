package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private Room currentRoom;
    private List<Waiter> waiters = new ArrayList<Waiter>();
    private List<Customer> customers = new ArrayList<Customer>();

    public void assignTableToWaiter(Waiter waiter){
        waiters.add(waiter);
    }

    public void addCustomers(List<Customer> incomingCustomers){
        customers.addAll(incomingCustomers);
    }
}
