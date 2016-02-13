package com.alex.domain;

/**
 * Created by Alexey on 12.02.2016.
 */
public class OrderDetails {
    private int orderId;
    private String source;
    private String destination;
    private String time;

    private static int counter = 0; // Global counter for calculating unique ID

    public OrderDetails() {
    }

    // Accept order details and insert unique ID for the order
    public OrderDetails(String source, String destination, String time) {
        this.source = source;
        this.destination = destination;
        this.time = time;
        counter++;
        orderId = counter;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return  "orderId = " + orderId +
                ", source = '" + source + '\'' +
                ", destination = '" + destination + '\'' +
                ", time = '" + time + '\'';
    }
}
