package com.alex.domain;

import java.util.Random;

/**
 * Created by Alexey on 11.02.2016.
 */
public class Order {
    private double bill;
    private OrderDetails orderDetails;
    private String taxi;

    public Order() {
    }

    // Accept order details and calculate Bill for payment
    public Order(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
        this.bill = calculateBill(this.orderDetails);
    }

    public double calculateBill(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
        // Some formula to calculate bill
        Random r = new Random();
        this.bill = (double) (r.nextInt((15 - 2) + 1) + 13) * 0.5;
        return bill;
    }

    public void linkTaxi(String taxi) {
        this.taxi = taxi;
    }

    public double getBill() {
        return bill;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public String getTaxi() {
        return taxi;
    }

    @Override
    public String toString() {
        return "Your order: " +
                orderDetails +
                ", car = '" + taxi + '\'' +
                "\n" + "Check for payment: " +
                bill + " $" + "\n";
    }
}
