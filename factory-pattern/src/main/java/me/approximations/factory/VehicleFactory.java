package me.approximations.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.approximations.Car;
import me.approximations.Motorbike;
import me.approximations.Vehicle;

import java.util.function.Function;

public class VehicleFactory {

    public static Vehicle create(VehicleType type) {
        return type.getFunction().apply(null);
    }

    @AllArgsConstructor
    @Getter
    public enum VehicleType {
        CAR(unused -> new Car()),
        MOTORBIKE(unused -> new Motorbike());

        final Function<Void, Vehicle> function;
    }
}
