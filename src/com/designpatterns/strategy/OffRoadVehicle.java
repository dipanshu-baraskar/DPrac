package com.designpatterns.strategy;

import com.designpatterns.strategy.vehiclestrategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{


    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
