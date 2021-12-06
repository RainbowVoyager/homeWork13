package com.cherevataya.vehicles;

import com.cherevataya.details.Engine;
import com.cherevataya.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private double carWeight;
    private final Driver driver;
    private final Engine engine;

    public Car(String carModel, String carClass, double carWeight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        System.out.println("Go go go!");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Right turn");
    }

    public void turnLeft() {
        System.out.println("Left turn");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", carWeight=" + carWeight +
                '}';
    }
}
