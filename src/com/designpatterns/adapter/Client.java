package com.designpatterns.adapter;

import com.designpatterns.adapter.adaptee.WeighingMachineImpl;
import com.designpatterns.adapter.adapter.WeighingMachineAdapter;
import com.designpatterns.adapter.adapter.WeighingMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(new WeighingMachineImpl());
        System.out.println(weighingMachineAdapter.getWeightInPounds());
    }
}
