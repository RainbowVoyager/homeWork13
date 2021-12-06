package com.cherevataya.professions;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Person {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    protected String fullName;
    protected int age;
    protected String dateOfBirth;
    //protected int calCAge;

    public Person(String fullName, LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth.format(FORMATTER);
    }

    //public Person(int calCAge) {
    //   this.calCAge = calCAge;
    // }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        LocalDate date = LocalDate.parse(dateOfBirth, FORMATTER);
        return Period.between(date, LocalDate.now()).getYears();
    }

    // public int getCalCAge() {
    //     return calCAge;
    // }

    //public int calCAge(int year, int month, int days){
    //    return LocalDate.now().minus(Period.of(year, month, days)).getYear();
    // }
    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }


}

