package me.approximations.factory;

import me.approximations.Vehicle;

public class Main {
    public static void main(String[] args) {
        final Vehicle car = VehicleFactory.create(VehicleFactory.VehicleType.CAR);
        System.out.println(car);

        final Vehicle motorbike = VehicleFactory.create(VehicleFactory.VehicleType.MOTORBIKE);
        System.out.println(motorbike);
    }
}
