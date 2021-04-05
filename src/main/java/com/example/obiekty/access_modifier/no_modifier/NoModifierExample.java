package com.example.obiekty.access_modifier.no_modifier;

import com.example.obiekty.access_modifier.no_modifier.package1.Laptop;
import com.example.obiekty.access_modifier.no_modifier.package2.Computer;

public class NoModifierExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // computer.name = "sdfsd"; // błąd dostępu
        System.out.println(computer.getName());
        computer.setName("setZProtectedExample");
        System.out.println(computer.getName());
        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());

    }
}
