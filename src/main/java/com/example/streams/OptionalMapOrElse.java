package com.example.streams;

import java.util.Optional;

public class OptionalMapOrElse {
    public static void main(String[] args) {
       Integer integer = Integer.valueOf(20);
     //  integer = null;
        Optional<Integer> opt = Optional.ofNullable(integer);
        Optional<Integer> opt2 = opt.map(e -> e * 3);
        System.out.println(opt2);
        System.out.println(opt2.orElse(Integer.valueOf(100)));
        Integer int2 = Integer.valueOf(500);
        int2 = null;
        Optional<Integer> optInt = Optional.ofNullable(int2);

        optInt.map(e -> e*1000)
                .map(i -> i*1000)
                .map(i -> i + 99)
                .ifPresent(System.out::println);

    }
}
