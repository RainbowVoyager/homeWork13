package com.cherevataya;

import com.cherevataya.details.*;

import com.cherevataya.professions.*;
import com.cherevataya.vehicles.*;
import java.time.LocalDate;
import java.util.Date;

/*1)  Автомобили. Создать класс Car в пакете vehicles , Engine в пакете details и Driver в пакете professions.
      Класс Driver содержит поля - ФИО, стаж вождения.
      Класс Engine содержит поля - мощность, производитель.
      Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
      Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
      А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
      Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
      Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
      Пусть класс Driver расширяет класс Person.

      2*) В класс Person вместо поля возраст добавить поле дата рождения как строка типа "18.12.1985"
      - добавить метод который выводит количество полных лет на данным момент.
 */
public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Ryan Thomas Gosling", LocalDate.of(1985, 12, 18), 20);
        System.out.println("Baby Driver: " + driver.getFullName() + " " + LocalDate.of(1985, 12, 18) + " " + "exp: " + driver.getDrivingExperience());
        // Person person = new Person(calCAge);
        createCar(driver);
        createSportCar(driver);
        createLorryCar(driver);
    }

    private static void createCar(Driver driver) {
        Engine engine = new Engine(1.5, "Subaru");
        Car car = new Car("Subaru Impreza", "C", 1.5, driver, engine);
        drive(car);
    }

    private static void createSportCar(Driver driver) {
        Engine engineSportCar = new Engine(6.2, "General Motors");
        Car sportCar = new Car("Chevrolet Corvette C8", "S", 1.5, driver, engineSportCar);
        drive(sportCar);
    }

    private static void createLorryCar(Driver driver) {
        Engine engineLorryCar = new Engine(7.9, "Paccar");
        Car lorryCar = new Car("Peterbilt 379", "F", 20.0, driver, engineLorryCar);
        drive(lorryCar);
    }

    private static void drive(Car car) {
        System.out.println(car);
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}