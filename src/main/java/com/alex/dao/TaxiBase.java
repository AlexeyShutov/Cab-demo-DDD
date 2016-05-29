package com.alex.dao;

import java.util.Random;

/**
 * Created by Alexey on 13.02.2016.
 */
public class TaxiBase {
    private static String taxi[] = {"Toyota-762", "Hyundai-251", "Chevrolet-523", "Mercedes-238", "BMW-452"};

    public static String[] getTaxi() {
        return taxi;
    }
}
