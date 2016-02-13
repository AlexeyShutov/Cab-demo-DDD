package com.alex.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 13.02.2016.
 */
public class Input {
    private static List<OrderDetails> allOrdersDetails = new ArrayList<OrderDetails>();

    public static void addInput(OrderDetails orderDetails) {
        allOrdersDetails.add(orderDetails);
    }

    public List<OrderDetails> getAllOrdersDetails() {
        return allOrdersDetails;
    }
}
