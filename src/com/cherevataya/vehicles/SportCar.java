package com.cherevataya.vehicles;

import com.cherevataya.details.Engine;
import com.cherevataya.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar(String carModel, String carClass, double carWeight, Driver driver, Engine engine, int speed) {
        super(carModel, carClass, carWeight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
