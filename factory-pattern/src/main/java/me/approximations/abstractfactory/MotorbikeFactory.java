package me.approximations.abstractfactory;

import me.approximations.Vehicle;
import me.approximations.VehicleType;

public class MotorbikeFactory implements VehicleFactory {
    @Override
    public Vehicle create() {
        return VehicleType.MOTORBIKE.getVehicleFunction().apply(null);
    }
}
