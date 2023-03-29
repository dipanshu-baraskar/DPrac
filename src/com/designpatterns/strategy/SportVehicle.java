package com.designpatterns.strategy;

import com.designpatterns.strategy.vehiclestrategy.SpecialDriveStrategy;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SpecialDriveStrategy());
    }
}
