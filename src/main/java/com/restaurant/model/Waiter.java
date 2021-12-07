package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.enumeration.OrderPaidStatus;

public class Waiter extends Person{
    private Room workingRoom;
    private int dailyTotalPaidOrders;
    private int dailyTotalUnPaidOrders;
    private List<Order> orders = new ArrayList<Order>();
    
    public Waiter(String name, String firstName){
        super(name, firstName);
        this.dailyTotalPaidOrders = 0;
        this.dailyTotalUnPaidOrders = 0;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int createOrder(int totalPrice){
        Order order = new Order();

        //Set order's total price
        order.setTotalPrice(totalPrice);

        //Add the created order to the order list owned by the waiter
        orders.add(order);
        
        //Append order price to the dailyTotal
        this.dailyTotalPaidOrders += order.getTotalPrice();

        return order.getTotalPrice();
    }

    public int getDailyTotalPaidOrders() {
        return dailyTotalPaidOrders;
    }

    public void setDailyTotalPaidOrders(int dailyTotalPaidOrder) {
        this.dailyTotalPaidOrders = dailyTotalPaidOrder;
    }

    public int getDailyTotalUnPaidOrders() {
        return dailyTotalUnPaidOrders;
    }

    public void setDailyTotalUnPaidOrders(int dailyTotalUnPaidOrder) {
        this.dailyTotalUnPaidOrders = dailyTotalUnPaidOrder;
    }

    public void declareUnPaidOrder(Order order){
        order.setPaidStatus(OrderPaidStatus.UNPAID);
    }

    public void declarePaidOrder(Order order){
        order.setPaidStatus(OrderPaidStatus.PAID);
    }

    public Room getWorkingRoom() {
        return workingRoom;
    }

    public void setWorkingRoom(Room workingRoom) {
        this.workingRoom = workingRoom;
    }
}
