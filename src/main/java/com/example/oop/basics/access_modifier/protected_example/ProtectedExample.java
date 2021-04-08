package com.example.oop.basics.access_modifier.protected_example;

import com.example.oop.basics.access_modifier.protected_example.package1.Laptop;
import com.example.oop.basics.access_modifier.protected_example.package2.Computer;

public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // computer.name = "sdfsd"; // błąd dostępu
        computer.setName("setZProtectedExample");
        System.out.println(computer.getName());
        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());
    }
}
