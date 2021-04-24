package com.example.files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamSerialization {
    public static void main(String[] args) throws IOException {
        CarObject car1 = new CarObject("Auris", "Toyota", 1999,200,1);
        CarObject car2 = new CarObject("Wow", "HOHO", 2005,250,2);
        CarObject car3 = new CarObject("Kokos", "KOKO", 1999,200,3);
        CarObject car4 = new CarObject("LOLO", "lolost", 1888,200,4);
        ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("files\\cars.dat")));
        out.writeObject(car1);
        out.writeObject(car2);
        out.writeObject(car3);
        out.writeObject(car4);
        out.flush();
        out.close();
    }
}
