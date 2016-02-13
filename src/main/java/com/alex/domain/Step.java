package com.alex.domain;

import java.util.Random;

/**
 * Created by Alexey on 11.02.2016.
 */
public class Step {
    private final StepType stepType;
    private final int stepNumber;
    private String taxi;

    public Step(StepType stepType, int stepNumber) {
        this.stepType = stepType;
        this.stepNumber = stepNumber;
    }

    // Finally approve order and add order to Output collection for archive
    public Order createOrder(OrderDetails newOrderDetails) {
        Order newOrder = new Order(newOrderDetails);
        findTaxi(newOrder);
        Output.addOutput(newOrder);
        return newOrder;
    }

    public String findTaxi(Order order) {
        int num;
        Random r = new Random();
        num = (r.nextInt(5)); // Generate some random value from [0..4]
        order.linkTaxi(TaxiBase.getTaxi()[num]); // Link car to current order
        return TaxiBase.getTaxi()[num];
    }

    public void sendPaymentSMS(Order order) {
        // In real world we will get customer number from DB first
        // to simplify this process, just print out SMS content
        System.out.println(order);
    }

    public StepType getStepType() {
        return stepType;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void addOutput(Order order) {
        Output.addOutput(order);
    }
}
