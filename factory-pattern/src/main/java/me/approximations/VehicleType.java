package me.approximations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.approximations.abstractfactory.VehicleFactory;
import me.approximations.abstractfactory.CarFactory;
import me.approximations.abstractfactory.MotorbikeFactory;

import java.util.function.Function;

@AllArgsConstructor
@Getter
public enum VehicleType {
    CAR(unused -> new Car(), unused -> new CarFactory()),
    MOTORBIKE(unused -> new Motorbike(), unused -> new MotorbikeFactory());

    final Function<Void, Vehicle> vehicleFunction;
    final Function<Void, VehicleFactory> vehicleFactoryFunction;
}