package com.restaurant.model;

import com.restaurant.enumeration.OrderPaidStatus;

public class Order {
    private int totalPrice = 0;
    private OrderPaidStatus paidStatus = OrderPaidStatus.PENDING;
    
    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public OrderPaidStatus getPaidStatus() {
        return paidStatus;
    }
    public void setPaidStatus(OrderPaidStatus paidStatus) {
        this.paidStatus = paidStatus;
    }
    
}
