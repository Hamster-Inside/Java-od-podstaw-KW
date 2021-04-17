package com.example.streams;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 200, 80000, 5));
        cars.add(new Car("Citroen", 250, 10000, 2));
        cars.add(new Car("Audi", 210, 50000, 4));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Wafelek", 100, 20000, 3));


        int numCars = (int) cars.stream().filter(e -> e.topSpeed > 200).count();
        System.out.println(numCars);
    }

}
