package org.anasantana.model;

public class SportsCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new SportsCar();
    }
}

