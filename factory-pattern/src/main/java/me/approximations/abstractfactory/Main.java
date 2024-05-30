package me.approximations.abstractfactory;

import me.approximations.Vehicle;
import me.approximations.VehicleType;

public class Main {
    public static void main(String[] args) {
        final VehicleFactory carFactory = VehicleFactory.create(VehicleType.CAR);
        final Vehicle car = carFactory.create();
        System.out.println(car);

        final VehicleFactory motorbikeFactory = VehicleFactory.create(VehicleType.MOTORBIKE);
        final Vehicle motorbike = motorbikeFactory.create();
        System.out.println(motorbike);
    }
}
