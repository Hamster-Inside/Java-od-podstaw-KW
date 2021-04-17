package com.example.streams;


import java.util.ArrayList;

public class StreamsBasic {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Asia");
        arr.add("Paweł");
        arr.add("Warzywniak");
        arr.add("Ola");
        arr.add("SuperWafel");
        arr.add("Kot");

        arr.stream().filter(e -> e.length() > 3 && e.length() < 6)
                .filter(e -> e.startsWith("A") || e.startsWith("P"))
                .forEach(e -> System.out.println(e));
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 200, 80000, 5));
        cars.add(new Car("Citroen", 250, 10000, 2));
        cars.add(new Car("Audi", 210, 50000, 4));
        cars.add(new Car("Roomba", 160, 10000, 5));
        cars.add(new Car("Wafelek", 100, 40000, 3));
        cars.stream().filter(e -> e.rating > 2)
                .filter(e -> e.price <60000)
                .filter(e -> e.topSpeed > 150)
                .forEach(e -> System.out.println(e.toString()));


    }
}
