package com.example.oop.basics.Inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
 Student student = new Student("Ania", "Kowalska", 5);
 Teacher teacher = new Teacher("Jan", "Jakiś", "math");
 Director director = new Director("Pan", "Panda", 2);
        System.out.println(teacher.getTeachingSubject());
    }

}
