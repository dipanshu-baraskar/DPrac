package com.designpatterns.strategy;

import com.designpatterns.strategy.vehiclestrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
