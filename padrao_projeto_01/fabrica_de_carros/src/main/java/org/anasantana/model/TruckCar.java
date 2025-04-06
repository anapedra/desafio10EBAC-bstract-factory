package org.anasantana.model;

public class TruckCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Montando caminhão 🚛");
    }

    @Override
    public String getType() {
        return "Caminhão";
    }
}