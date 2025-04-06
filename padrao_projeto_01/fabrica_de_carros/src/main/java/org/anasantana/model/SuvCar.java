package org.anasantana.model;

public class SuvCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Montando SUV 🚙");
    }

    @Override
    public String getType() {
        return "SUV";
    }
}