package org.example.inheritance;
import static org.example.util.Header.writeHeader;

public class InheritanceService {

    public static void inherit() {

        writeHeader("Inheritance");

        Vehicle vehicle = new Vehicle();

        vehicle.startEngine();
        vehicle.stopEngine();

        //Car and motorbike inherit vehicle
        Car car = new Car();

        car.startEngine();
        car.stopEngine();

        Motorbike motorbike = new Motorbike();

        motorbike.startEngine();
        motorbike.stopEngine();
    }
}
