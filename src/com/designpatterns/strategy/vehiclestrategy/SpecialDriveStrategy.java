package com.designpatterns.strategy.vehiclestrategy;

import com.designpatterns.strategy.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
