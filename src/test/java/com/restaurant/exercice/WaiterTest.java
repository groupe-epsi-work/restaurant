package com.restaurant.exercice;

import com.restaurant.model.Waiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test des serveurs")
public class WaiterTest {
    
    
	// ÉTANT DONNÉ un nouveau serveur
	// QUAND on récupére son chiffre d'affaires
	// ALORS celui-ci est à 0
    @Test
    @DisplayName("Un nouveau serveur doit avoir un chiffre d'affaires à zéro")
    public void testNewWaiterShouldHaveDailyPaidOrderToZero(){
        // Given
        Waiter waiter = new Waiter("Gilbert", "Hugo");

        // When
        int dailyTotalPaidOrders = waiter.getDailyTotalPaidOrders();

        // Then
        Assertions.assertEquals(0, dailyTotalPaidOrders);
    }

    
	// ÉTANT DONNÉ un nouveau serveur
	// QUAND il prend une commande
	// ALORS son chiffre d'affaires est le montant de celle-ci
    @Test
    @DisplayName("Un serveur prend une commande et son chiffre d'affaire est égal au prix de la commande")
    public void testWaiterTakeOrderThenDailyTotalPaidIsEqualToOrderPrice(){
        // Given
        Waiter waiter = new Waiter("Gilbert", "Hugo");

        //When
        int orderTotalPrice = waiter.createOrder(54);

        //Then
        Assertions.assertEquals(orderTotalPrice, waiter.getDailyTotalPaidOrders());        
    }

    
	// ÉTANT DONNÉ un serveur ayant déjà pris une commande
	// QUAND il prend une nouvelle commande
	// ALORS son chiffre d'affaires est la somme des deux commandes
    
    @Test
    @DisplayName("Un serveur avec deux commandes doit avoir un chiffre d'affaires égal au total des deux commandes")
    public void testWaiterTakeTwoOrderAndDailyTotalPaidIsEqualsToBothOrder(){
        // Given
        Waiter waiter = new Waiter("Gilbert", "Hugo");

        //When
        waiter.createOrder(21);
        waiter.createOrder(89);

        int dailyTotalPaidOders = waiter.getOrders().stream().map(e -> e.getTotalPrice()).reduce(0, Integer::sum);

        //Then
        Assertions.assertEquals(dailyTotalPaidOders, waiter.getDailyTotalPaidOrders());
    }


}
