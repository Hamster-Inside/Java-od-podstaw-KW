package com.example.programs;

import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoje imie:");
        String name = in.nextLine();
        System.out.println("Podane imie to: " + name);

    }
}
