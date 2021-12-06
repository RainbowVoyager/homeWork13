package com.cherevataya.professions;


import java.time.LocalDate;

public class Driver extends Person {


    private final int drivingExperience;

    public Driver(String fullName, LocalDate dateOfBirth, int drivingExperience) {
        super(fullName, dateOfBirth);
        this.drivingExperience = drivingExperience;
    }


    public int getDrivingExperience() {
        return drivingExperience;
    }


}

