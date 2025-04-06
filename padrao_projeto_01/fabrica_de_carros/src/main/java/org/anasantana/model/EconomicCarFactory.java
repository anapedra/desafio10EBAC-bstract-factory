package org.anasantana.model;

public class EconomicCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new EconomicCar();
    }
}
