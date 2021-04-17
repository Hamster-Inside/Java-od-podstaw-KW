package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinMethods {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 200, 80000, 5));
        cars.add(new Car("Citroen", 250, 10000, 2));
        cars.add(new Car("Audi", 210, 50000, 4));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Wafelek", 100, 40000, 3));


        Car carHighestPrice = cars.stream()
                .max((car1, car2) -> car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carHighestPrice);
        Car carLowestPrice = cars.stream()
                .min((car1, car2) -> car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carLowestPrice);
        Car carHighestRating = cars.stream()
                .max((car1, car2) -> car1.rating > car2.rating ? 1 : -1)
                .get();
        System.out.println(carHighestRating);

    }
}
