package com.designpatterns.strategy.vehiclestrategy;

import com.designpatterns.strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
