package com.restaurant.exercice.controller;

import com.restaurant.exercice.model.Order;
import com.restaurant.exercice.model.Restaurant;
import com.restaurant.exercice.service.OrderService;
import com.restaurant.exercice.service.RestaurantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class MainController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("Hello");
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Integer id) {
        return ResponseEntity.ok().body(orderService.getOrderById(id));
    }

    @PutMapping("/order/{id}/pay")
    public ResponseEntity<String> payForOrder(@PathVariable Integer id) {
        orderService.payOrder(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/restaurant/{id}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable Integer id) {
        Restaurant restaurant = this.restaurantService.getRestaurantById(id);
        return ResponseEntity.ok().body(restaurant);
    }
}
