package com.example.streams;

import java.util.Optional;

public class OptionalOrMethod {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(9999);
        Optional<Integer> opt = Optional.ofNullable(integer);
        Integer result = opt.filter(i -> i > 0)
                .filter(i -> i<50000)
                .map(i -> i*2)
                .filter(i -> i<100000)
                .or(() -> Optional.ofNullable((Integer.valueOf(1200))))
                        .orElse(Integer.valueOf(2000));
        System.out.println(result);
    }
}
