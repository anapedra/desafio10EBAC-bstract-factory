package org.anasantana.model;

public class EconomicCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Montando carro econômico 🚗");
    }

    @Override
    public String getType() {
        return "Econômico";
    }
}
