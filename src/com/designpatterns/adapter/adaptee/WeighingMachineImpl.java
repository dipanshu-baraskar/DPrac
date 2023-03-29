package com.designpatterns.adapter.adaptee;

public class WeighingMachineImpl implements WeighingMachine {
    @Override
    public int getWeight() {
        return 100;
    }
}
