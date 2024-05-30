package me.approximations.abstractfactory;

import me.approximations.Vehicle;
import me.approximations.VehicleType;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle create() {
        return VehicleType.CAR.getVehicleFunction().apply(null);
    }
}
