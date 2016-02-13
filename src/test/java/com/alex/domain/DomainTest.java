package com.alex.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests.
 */
public class DomainTest {
    @Test
    public void createOrderTest() {
        OrderDetails orderDetails1 = new OrderDetails("Empire state building", "Green Ave 1", "15:00");
        Order order1 = new Order();
        StepType stepType = new StepType("Create Order");
        Step step = new Step(stepType, 1);
        order1 = step.createOrder(orderDetails1);
        Assert.assertEquals("Empire state building", order1.getOrderDetails().getSource());
        Assert.assertEquals("Green Ave 1", order1.getOrderDetails().getDestination());
        Assert.assertEquals("15:00", order1.getOrderDetails().getTime());
    }

    @Test
    public void findOrderTest() {
        OrderDetails orderDetails1 = new OrderDetails("Washington Str 23", "Green Ave 3", "18:00");
        Order order1 = new Order();
        StepType stepType = new StepType("Test");
        Step step = new Step(stepType, 1);
        order1 = step.createOrder(orderDetails1);
        OrderDetails orderD2 = new OrderDetails();
        int orId1 = 1;
        Assert.assertNotNull(Output.findOrder(orId1));
        Assert.assertNull(Output.findOrder(845021));
    }

    @Test
    public void createStepTest() {
        StepType stepType1 = new StepType("Create order");
        Step step1 = new Step(stepType1, 1);
        Assert.assertEquals(stepType1, step1.getStepType());
        Assert.assertEquals("Create order", stepType1.getStepName());
        Assert.assertEquals(1, step1.getStepNumber());
    }

    @Test
    public void findTaxiTest() {
        StepType stepType = new StepType("Create order");
        Step step = new Step(stepType, 1);
        OrderDetails orderDetails1 = new OrderDetails("North Ave 13", "Green Ave 23", "10:00");
        Order order1 = new Order();
        order1 = step.createOrder(orderDetails1);
        StepType stepType2 = new StepType("Find Taxi");
        Step step2 = new Step(stepType2, 2);
        Assert.assertNotNull(step2.findTaxi(order1));
    }
}
