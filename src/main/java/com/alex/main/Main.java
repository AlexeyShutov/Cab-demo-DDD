package com.alex.main;

import com.alex.domain.*;

import java.util.List;

/**
 * Created by Alexey on 11.02.2016.
 * This application is for demonstrating process of calling taxi
 */
public class Main {
    public static void main(String args[]) {
        StepType stepType1 = new StepType("Create an order");
        OrderDetails orderDetails1 = new OrderDetails("Green Ave 1", "South Park 22", "11:20");

        stepType1.addInput(orderDetails1);
        Step step1 = new Step(stepType1, 1);

        Order order1;
        order1 = step1.createOrder(orderDetails1);

        StepType stepType2 = new StepType("Find a taxi");
        Step step2 = new Step(stepType2, 2);
        step2.findTaxi(order1);

        StepType stepType3 = new StepType("Send payment info");
        Step step3 = new Step(stepType3, 3);
        step3.sendPaymentSMS(order1);

        System.out.println("-------------------------------------------------------------------------------------");

        OrderDetails orderDetails2 = new OrderDetails("Oak alley 10", "North highway 1", "19:30");

        stepType1.addInput(orderDetails2);

        Order order2;
        order2 = step1.createOrder(orderDetails2);

        step2.findTaxi(order2);

        step3.sendPaymentSMS(order2);

        System.out.println("-------------------------------------------------------------------------------------");

        OrderDetails orderDetails3 = new OrderDetails("North Ave 13", "Green Ave 23", "10:00");

        stepType1.addInput(orderDetails2);

        Order order3;
        order3 = step1.createOrder(orderDetails3);

        step2.findTaxi(order3);

        step3.sendPaymentSMS(order3);

        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Print orders archive: ");
        Output output = new Output();
        List<Order> list1 = output.getAllOrders();
        for (Order ord : list1)
            System.out.println(ord);

        System.out.println("-------------------------------------------------------------------------------------");

        int orderID = 2;
        System.out.println("Find order by ID: " + orderID);
        System.out.println(Output.findOrder(orderID));
    }
}
