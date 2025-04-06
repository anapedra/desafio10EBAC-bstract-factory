package org.anasantana;

import org.anasantana.model.*;

public class Main {
    public static void main(String[] args) {
        CarFactory[] factories = {
            new SportsCarFactory(),
            new EconomicCarFactory(),
            new SuvCarFactory(),
            new TruckCarFactory()
        };

        for (CarFactory factory : factories) {
            for (int i = 0; i < 3; i++) {
                Car car = factory.createCar();
                car.assemble();
            }
            System.out.println();
        }
    }
}