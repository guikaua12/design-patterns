package me.approximations.factory;

import me.approximations.Vehicle;
import me.approximations.VehicleType;

public class Main {
    public static void main(String[] args) {
        final Vehicle car = VehicleFactory.create(VehicleType.CAR);
        System.out.println(car);

        final Vehicle motorbike = VehicleFactory.create(VehicleType.MOTORBIKE);
        System.out.println(motorbike);
    }
}
