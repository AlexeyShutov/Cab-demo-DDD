package com.alex.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 13.02.2016.
 */
public class Output {
    private static List<Order> allOrders = new ArrayList<Order>();

    public static void addOutput(Order order) {
        allOrders.add(order);
    }

    public List<Order> getAllOrders() {
        return allOrders;
    }

    // Find order by order ID from collection
    public static Order findOrder(int orderId) {
        for (Order ord : allOrders) {
            if (orderId == ord.getOrderDetails().getOrderId())
                return ord;
        }
        return null;
    }
}
