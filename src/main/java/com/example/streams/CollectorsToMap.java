package com.example.streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToMap {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 200, 80000, 5));
        cars.add(new Car("Citroen", 250, 10000, 2));
        cars.add(new Car("Audi", 210, 50000, 4));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Wafelek", 100, 40000, 3));


        Map<String, Car> carsMap = cars.stream().collect(Collectors.toMap(e -> e.name, e -> e));
        System.out.println(carsMap);
        Car car1 = carsMap.get("Roomba");
        System.out.println(car1);
    }
}
