package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Waiter> waiters = new ArrayList<Waiter>();
    private int dailyIncomes;

    public Restaurant(List<Waiter> waiters){
        this.dailyIncomes = 0;
        this.waiters = waiters;
    }

    public List<Waiter> getWaiters() {
        return waiters;
    }
    public void setWaiters(List<Waiter> waiters) {
        this.waiters = waiters;
    }
    public int getDailyIncomes() {
        return dailyIncomes;
    }
    public void setDailyIncomes(int dailyIncomes) {
        this.dailyIncomes = dailyIncomes;
    }

    public void retrieveAllDailyTotalPaidOrder(){
        this.dailyIncomes = 0;

        waiters.stream().map(e -> this.dailyIncomes += e.getDailyTotalPaidOrders());

    }

    
}
