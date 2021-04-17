package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 200, 80000, 5));
        cars.add(new Car("Citroen", 250, 10000, 2));
        cars.add(new Car("Audi", 210, 50000, 4));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Wafelek", 100, 20000, 3));
        List<Car> cars2elements = cars.stream().filter(e -> e.price < 30000)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(cars2elements);

    }
}
