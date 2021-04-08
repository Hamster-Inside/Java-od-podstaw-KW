package com.example.oop.basics.Inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam", "Kowalski", 12);
        worker1.printInfo();
        Manager manager = new Manager("Piesio", "Piesiowski", 55, "Wow Department");
        manager.printInfo();
        Person person = manager;
        System.out.println(person.getSurname());
        Person person2 = new Manager("Wow", "Wowski", 55, "wtf");
        if (person2 instanceof Manager){
            person2 = new Manager(person2.getName(),person2.getSurname(),person2.getAge(),((Manager) person2).getDepartmentName());
            System.out.println(((Manager) person2).getDepartmentName());
        }
        ((Manager)person2).getDepartmentName();
    }
}
