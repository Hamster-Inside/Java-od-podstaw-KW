package com.example.basics.types;

public class BlankStringAndNull{
    public static void main(String[] args) {
        String a1 = "null";
        String a2 = null;
        a2 = "nulle";
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        if (a1.contentEquals(a2)){
            System.out.println("null=null");
        }
        else{
            System.out.println("nulle to nie nulle");
        }

        String a3 = "       Hello World!         ";
        System.out.println("\"" + a3.trim() + "\"");
        System.out.println("\"" + a3.stripLeading() + "\"");
        System.out.println("\"" + a3.stripTrailing() + "\"");
        System.out.println("\"" + a3.strip() + "\"");


    }
}
