package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        // TODO: "Car is moving" 출력
    }
}

class Bike extends Vehicle {
    void move() {
        // TODO: "Bike is moving" 출력
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            vehicles[i] = type.equals("car") ? new Car() : new Bike();
        }
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}