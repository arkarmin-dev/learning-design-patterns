package org.example.encapsulation;


//hiding data (fields) with private keywords and provide access to fields with accessors and mutators

public class Car {
    private String brand;
    private int speed;


    //GETTER - ACCESSOR
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    //SETTER - MUTATOR
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
