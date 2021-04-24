package com.example.files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("files\\test.dat")));
            out.writeUTF("Testowy strumień binarny");
            out.writeShort(32000);
            out.writeLong(234242342234234234L);
            out.writeFloat(324242234.23423423f);
            out.writeDouble(23424322.23423423d);
            out.writeByte(12);
            out.writeChar('A');
            out.writeBoolean(true);
            out.flush(); // wymuszenie zapisu z bufora

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }
}
