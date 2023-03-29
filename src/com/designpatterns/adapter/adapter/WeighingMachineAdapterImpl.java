package com.designpatterns.adapter.adapter;

import com.designpatterns.adapter.adaptee.WeighingMachine;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter {

    WeighingMachine weighingMachine;

    public WeighingMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInPounds() {
        double weightInKg = weighingMachine.getWeight();
        return weightInKg * 2.2;
    }
}
