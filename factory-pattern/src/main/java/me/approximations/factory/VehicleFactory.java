package me.approximations.factory;

import me.approximations.Vehicle;
import me.approximations.VehicleType;

public class VehicleFactory {

    public static Vehicle create(VehicleType type) {
        return type.getVehicleFunction().apply(null);
    }
}
