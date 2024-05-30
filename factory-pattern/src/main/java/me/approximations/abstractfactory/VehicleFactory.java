package me.approximations.abstractfactory;

import me.approximations.Vehicle;
import me.approximations.VehicleType;

public interface VehicleFactory {
    Vehicle create();

    static VehicleFactory create(VehicleType type) {
        return type.getVehicleFactoryFunction().apply(null);
    }

}
