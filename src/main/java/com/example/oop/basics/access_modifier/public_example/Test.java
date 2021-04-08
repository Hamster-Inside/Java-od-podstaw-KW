package com.example.oop.basics.access_modifier.public_example;

import com.example.oop.basics.access_modifier.public_example.package1.BasicClass;
import com.example.oop.basics.access_modifier.public_example.package2.OtherClass;

public class Test {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        basicClass.name = "basic";
        OtherClass otherClass = new OtherClass();
        otherClass.setName("setNameZTestu");
        System.out.println(basicClass.name);
        System.out.println(otherClass.name);
    }
}
