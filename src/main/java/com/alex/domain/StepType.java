package com.alex.domain;

/**
 * Created by Alexey on 11.02.2016.
 */
public class StepType {
    private final String stepName;

    public StepType(String stepName) {
        this.stepName = stepName;
    }

    public String getStepName() {
        return stepName;
    }

    public void addInput(OrderDetails orderDetails) {
        Input.addInput(orderDetails);
    }
}
