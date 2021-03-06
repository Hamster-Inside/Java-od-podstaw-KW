package com.example.streams;

import java.util.Optional;

public class OptionalCreateOfNullableEmpty {
    public static void main(String[] args) {
        // Optional.of() // tworzy optional który nie może być null
        Optional<String> opt1 = Optional.of("test");
        System.out.println(opt1.get());
        //  Optional<String> opt2 = Optional.of(null);

        Optional<String> opt3 = Optional.ofNullable(null);
        System.out.println(opt3);

        Optional<String> opt4 = Optional.ofNullable("HOHO");
        System.out.println(opt4.get());

        Optional<String> opt5 = Optional.empty();
        System.out.println(opt5);

        Integer integer = Integer.valueOf(10);
        Optional<Integer> optInt = Optional.ofNullable(integer);
        if (optInt.isPresent()){
            System.out.println("Jest zawartość: " + optInt.get());
        }
        else {
            System.out.println("Nie ma zawartości");
        }
        optInt.ifPresent(e -> System.out.println("wyszło z ispresent e"));
        optInt.ifPresent(System.out::println);
    }
}
