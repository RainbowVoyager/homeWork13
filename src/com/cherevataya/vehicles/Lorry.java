package com.cherevataya.vehicles;

import com.cherevataya.details.Engine;
import com.cherevataya.professions.Driver;

public class Lorry extends Car {
    private int liftingCapacity;

    public Lorry(String carModel, String carClass, double carWeight, Driver driver, Engine engine, int liftingCapacity) {
        super(carModel, carClass, carWeight, driver, engine);
        this.liftingCapacity = liftingCapacity;
    }

    public int getCarrying() {
        return liftingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + liftingCapacity +
                '}';
    }
}
