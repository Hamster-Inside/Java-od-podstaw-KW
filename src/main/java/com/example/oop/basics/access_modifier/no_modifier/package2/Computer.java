package com.example.oop.basics.access_modifier.no_modifier.package2;

import com.example.oop.basics.access_modifier.no_modifier.package1.Product;

public class Computer extends Product {

    public Computer(){

        //name = "Computer"; // powoduje błąd, brak dostępuj do zmiennej z innego pakietu gdy nie ma modyfikatora
        setName("Computer");
    }


}
