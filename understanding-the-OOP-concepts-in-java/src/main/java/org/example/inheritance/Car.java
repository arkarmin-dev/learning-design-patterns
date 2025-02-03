package org.example.inheritance;

public class Car extends Vehicle {
    public void startEngine(){ //method overriding
        System.out.println("Car starts engine");
    }
    public void stopEngine(){
        System.out.println("Car stops engine");
    }
}
