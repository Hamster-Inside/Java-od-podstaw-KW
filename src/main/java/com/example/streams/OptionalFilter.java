package com.example.streams;

import java.util.Optional;

public class OptionalFilter {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("tekst podstawowy");
        opt.map(i -> i + " - Dluzszy tekst")
                .filter(i -> i.length() > 20)
                .or(() -> Optional.ofNullable("Wowowo"))
                .ifPresent(System.out::println);
    }
}
