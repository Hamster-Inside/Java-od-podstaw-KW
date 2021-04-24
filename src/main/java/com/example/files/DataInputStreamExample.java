package com.example.files;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        DataInputStream in = null;
        try {
            in = new DataInputStream(
                    new FileInputStream("files\\test.dat"));
//            in.writeUTF("Testowy strumień binarny");
            String str = in.readUTF();
            System.out.println(str);
//            in.writeShort(32000);
            short shortNum = in.readShort();
            System.out.println(shortNum);
//            in.writeLong(234242342234234234L);
            long longNum = in.readLong();
            System.out.println(longNum);
//            in.writeFloat(324242234.23423423f);
            float floatNum = in.readFloat();
            System.out.println(floatNum);
//            in.writeDouble(23424322.23423423d);
            double doubleNum = in.readDouble();
            System.out.println(doubleNum);
//            in.writeByte(12);
            byte byteNum = in.readByte();
            System.out.println(byteNum);
//            in.writeChar('A');
            char charNum = in.readChar();
            System.out.println(charNum);
//            in.writeBoolean(true);
            boolean booleanNum = in.readBoolean();
            System.out.println(booleanNum);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
    }
}
