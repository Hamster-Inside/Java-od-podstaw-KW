package com.example.streams;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class SummingInt {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 200, 80000, 5));
        cars.add(new Car("Citroen", 250, 10000, 2));
        cars.add(new Car("Audi", 210, 50000, 4));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Wafelek", 100, 40000, 3));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Roomba", 160, 10000, 5));

        Set<Car> set = cars.stream().filter(e -> e.price < 30000).collect(Collectors.toSet());

        set.forEach(e -> System.out.println(e));

int totalPrice = cars.stream().collect(Collectors.summingInt(e -> e.price));
        System.out.println(totalPrice);

    }
}
