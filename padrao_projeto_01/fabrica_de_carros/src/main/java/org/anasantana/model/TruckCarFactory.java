package org.anasantana.model;

public class TruckCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new TruckCar();
    }
}