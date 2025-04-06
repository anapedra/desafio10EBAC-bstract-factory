package org.anasantana.model;

public class SuvCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new SuvCar();
    }
}
