package com.example.collections;

import java.util.ArrayList;

class Person{
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}

public class ArrayListMethods {
    public static void main(String[] args) {
        Person p1 = new Person("Adam");
        Person p2 = new Person("Ewa");
        Person p3 = new Person("GOD");
        Person p4 = new Person("Daniel");
        Person p5 = new Person("Annnnna");

        ArrayList<Person> arr1 = new ArrayList<>();
        arr1.add(p1);
        arr1.add(p2);
        arr1.add(p3);
        arr1.add(p4);
        arr1.add(p5);
        for (Person p : arr1){
            System.out.println(p);
        }
        Person p6 = new Person("Bartek");
        Person p7 = new Person("Marek");
        Person p8 = new Person("wowwowowoow");
        ArrayList<Person> arr2 = new ArrayList<>();
        arr2.add(p6);
        arr2.add(p7);
        System.out.println("Po dodaniu: ");
        arr1.addAll(arr2);
        arr2.add(p8);
        for (Person p : arr1){
            System.out.println(p);
        }
        if (arr1.contains(p4)){
            System.out.println("arr1 posiada p4");
        }
        arr2.remove(p8);
        arr1.removeAll(arr2);
        if (arr1.containsAll(arr2)){
            System.out.println("arr 1 posiada wszystkie elementy arr2");
        }
        Person people[] = new Person[arr1.size()];
        people = arr1.toArray(people);
        System.out.println(people.length);
        arr1.clear();
        if (arr1.isEmpty()){
            System.out.println("arr1 pusta");
        }

    }
}
