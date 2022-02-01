package com.restaurant.exercice.service;

import java.util.List;
import java.util.Objects;

import com.restaurant.exercice.enumeration.OrderStatus;
import com.restaurant.exercice.model.Order;
import com.restaurant.exercice.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();

    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrderById(Integer id) {
        return orderRepository.findById(id).get();
    }

    public void payOrder(Integer id) {
        Order orderToSave = orderRepository.getById(id);

        if (Objects.nonNull(orderToSave)) {
            orderToSave.setOrderStatus(OrderStatus.PAID);
            orderRepository.save(orderToSave);
        }
    }
}
