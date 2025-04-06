package org.anasantana.model;

public class SportsCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Montando carro esportivo 🏎️");
    }

    @Override
    public String getType() {
        return "Esportivo";
    }
}
