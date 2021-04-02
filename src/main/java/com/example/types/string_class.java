package com.example.types;

import java.security.KeyStore;

public class string_class {
    public static void main(String[] args) {


        String s1 = "Hello World!";
        System.out.println(s1);
        String s2 = new String("String passed to constructor");
        System.out.println(s2);
        String s3 = "Test ".repeat(5);
        System.out.println(s3);
        String s4 = String.join(".", "1", "2", "3", "4", "5");
        System.out.println(s4);
        char arr[] = {'0', '1', '2', '3', 'A', 'B'};
        String s5 = new String(arr);
        System.out.println(s5);

        String str = "Tek";
        String str2 = "st";
        String potato = "Tekst";
        String str3 = str + str2;
        System.out.println("str3 = " + str3 + " vs " + potato + " = (potato)");
        if (str3 == potato) {
            System.out.println("TRUE - str3 = potato");
        } else {
            System.out.println("FALSE - str3 =/ potato");
        }
        if (str3.contentEquals(potato)){
            System.out.println("contentEquals = TRUE");
        }


    }
}
