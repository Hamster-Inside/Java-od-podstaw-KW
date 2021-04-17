package com.example.streams;

import java.util.stream.Stream;

public class IterateCreateStreams {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n+1).limit(10)
                .forEach(s -> System.out.println(s));
        Stream.iterate(1, n -> n < 15, n -> n+2)
                .forEach(e -> System.out.println(e));
    }
}
