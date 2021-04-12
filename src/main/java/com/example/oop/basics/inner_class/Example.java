package com.example.oop.basics.inner_class;

import org.w3c.dom.ls.LSOutput;

class SomeExample {
    private class PrivClass {
        public void printInfo() {
            System.out.println("printInfo from PrivClass");
        }
    }

    public void run() {
        PrivClass privClass = new PrivClass();
        privClass.printInfo();
        class InnerClass{
            public void printInfo(){
                System.out.println("printInfo from InnerClass");
            }

        }
        InnerClass innerClass = new InnerClass();
        innerClass.printInfo();
    }
    public class PubClass{
        public void printInfo(){
            System.out.println("printInfo from PubClass");
        }

    }
}

public class Example {
    public static void main(String[] args) {
        SomeExample someExample = new SomeExample();
        someExample.run();
        SomeExample.PubClass pubClass = someExample.new PubClass();
        pubClass.printInfo();
    }
}
