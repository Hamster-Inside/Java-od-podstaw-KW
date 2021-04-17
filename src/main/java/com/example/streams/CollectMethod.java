package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 200, 80000, 5));
        cars.add(new Car("Citroen", 250, 10000, 2));
        cars.add(new Car("Audi", 210, 50000, 4));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Wafelek", 100, 40000, 3));

        List<Car> list = cars.stream().filter(e -> e.price < 30000).collect(Collectors.toList());
        ArrayList<Car> carArrayList = new ArrayList<>(list);
        carArrayList.forEach(e -> System.out.println(e));
    }
}