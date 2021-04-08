package com.example.oop.basics.access_modifier.private_example;

public class Product {
    private String name;
    public Product(){
        this.name = "unknown";
    }

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + "!";
    }
}
