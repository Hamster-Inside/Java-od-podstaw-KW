package com.example.obiekty.methods;

class Car{
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;
    public void printInfo() {
        System.out.println(this.manufacturer + " " +
                this.name + " " +
                this.year);
    }
        public Car(){
            this.manufacturer = "unknown";
            this.name = "uknown";
            this.year = 0;
            this.color = "uknown";
            this.topSpeed = 0;

        }
        public Car(String manufacturer, String name, int year, String color, float topSpeed){
            this.manufacturer = manufacturer;
            this.name = name;
            this.year = year;
            this.color = color;
            this.topSpeed = topSpeed;
        }
    }


public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "Blue";
        ford.year = 1999;
        ford.topSpeed = 250f;

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "Yellow";
        chevrolet.year = 2005;
        chevrolet.topSpeed = 200f;

        Car renault = new Car("Renault","Megane",2003,"Red",180);

        ford.printInfo();
        chevrolet.printInfo();
        renault.printInfo();
    }
}
