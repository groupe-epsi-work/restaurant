package com.restaurant.exercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.restaurant.model.Restaurant;
import com.restaurant.model.Waiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test du Restaurant")
public class RestaurantTest {
    // ÉTANT DONNÉ un restaurant ayant X serveurs
    // QUAND tous les serveurs prennent une commande d'un montant Y
    // ALORS le chiffre d'affaires du restaurant est X * Y
    // CAS(X = 0; X = 1; X = 2; X = 100)
    // CAS(Y = 1.0)
    @DisplayName("Test si le chiffre d'affaires du restaurant est égal à tous les chiffres d'affaires de tous les serveurs")
    @ParameterizedTest
    @ValueSource(ints = {51})
    public void testRestaurantDailyIncomesEqualsToAllWaitersDailyTotalPaidOrders(int nbWaiters){
        // Given
        List<Waiter> waiters = new ArrayList<Waiter>(Collections.nCopies(nbWaiters, new Waiter("", "")));
        Restaurant restaurant = new Restaurant(waiters);
        int orderPrice = 1;
        int totalPrice = nbWaiters * orderPrice;

        //When
        for(Waiter waiter : restaurant.getWaiters()){
            waiter.createOrder(orderPrice);
            System.err.println(waiter.getDailyTotalPaidOrders());
        }

        restaurant.retrieveAllDailyTotalPaidOrder();

        //Then
        Assertions.assertEquals(totalPrice, restaurant.getDailyIncomes());
    }

}
