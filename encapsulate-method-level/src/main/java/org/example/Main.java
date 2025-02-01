package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

     ArrayList<Product> order = new ArrayList<>();

     Product p1 = new Product("Apple", 2000, 3);
     Product p2 = new Product("Banana", 400, 5);
     Product p3 = new Product("Orange", 800, 8);

     order.add(p1);
     order.add(p2);
     order.add(p3);

     System.out.println("Total Price with no encapsulation method in India: $" +
             getTotalPriceWithoutEncapsulation(order, "India"));

     System.out.println("Total Price with no encapsulation method in USA: $" +
             getTotalPriceWithoutEncapsulation(order, "USA"));

     System.out.println("Total Price with encapsulation method in India: $" +
             getTotalPriceWithEncapsulation(order, "India"));

     System.out.println("Total Price with encapsulation method in USA: $" +
             getTotalPriceWithEncapsulation(order, "USA"));

    }

    //In this method tax-related formula may change over time
    //We can extract tax-related calculation from this method
    public  static int getTotalPriceWithoutEncapsulation(ArrayList<Product> order,String country) {
        int totalPrice = 0;
        double tax = 0;
        for (Product p : order) {
            totalPrice += p.getPrice() * p.getQuantity();
        }
        if(country.equals("India")) {
            tax = 0.05;
            totalPrice += totalPrice * tax;
        }else if(country.equals("USA")) {
            tax = 0.10;
            totalPrice += totalPrice * tax;
        }
        return totalPrice;
    }

    //With separation by encapsulating getTaxByCountry(country),
    // we can modify the tax changes later without touching the totalPrice method.
    public static int getTotalPriceWithEncapsulation(ArrayList<Product> order,String country) {
        int totalPrice = 0;
        for (Product p : order) {
            totalPrice += p.getPrice() * p.getQuantity();
        }

        return totalPrice += totalPrice * getTaxByCountry(country);
    }

    public static double getTaxByCountry(String country) {
        double tax = 0;
        if(country.equals("India")) {
            tax = 0.03;
        }else if(country.equals("USA")) {
            tax = 0.07;
        }else {
            tax = 0;
        }
        return tax;
    }
}

class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}