package com.example.obiekty.Inheritance.finalExample;
class Employee{
    String name;
    String surname;
    String jobTitle;
    float salary;
}
class Manager extends Employee {
    String responsibility;
}
class Director extends Manager {
    String department;
}
class VicePresident extends Director {
}
final class CEO extends VicePresident { //Nie można rozszerzyć klasy final -> stworzyć extends CEO
    String companyName;
}
public class Test {
    public static void main(String[] args) {
        CEO ceo = new CEO();
    }
}
