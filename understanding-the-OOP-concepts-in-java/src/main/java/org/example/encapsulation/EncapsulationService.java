package org.example.encapsulation;

import static org.example.util.Header.writeHeader;

public class EncapsulationService {

    public static void encapsulate() {

        writeHeader("Encapsulation");

        Car car1 = new Car();   //creating instances of car object
        Car car2 = new Car();

        car1.setBrand("BMW"); //setting brand names of car objects
        car2.setBrand("Audi");

        car1.setSpeed(200); //setting speed of car objects
        car2.setSpeed(220);

        System.out.println("Car 1 Brand: " + car1.getBrand()); //access the fields through getter method
        System.out.println("Car 1 Speed: " + car1.getSpeed());
        System.out.println();
        System.out.println("Car 2 Brand: " + car2.getBrand());
        System.out.println("Car 2 Speed: " + car2.getSpeed());
        System.out.println();
    }
}
