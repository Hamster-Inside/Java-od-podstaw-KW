package com.example.basics.types;

public class Substring {
    public static void main(String[] args) {
        String str = "KOKOS ANANAS ZUPA";
        System.out.println(str.substring(7));
        System.out.println(str.substring(7,10));
        String str2 = " \n";
        System.out.println(str2.isBlank());
        System.out.println(str2.isEmpty());
        System.out.println(str.startsWith("Ola "));
        String wow = "wow";
        wow = wow.replaceAll("wow","wow wow ").repeat(2) + "kokos";
        wow = wow.replaceFirst("wow","YO");
        System.out.println(wow);
        int index= wow.indexOf("kokos");
        System.out.println(index);

        char arr[] = str.toCharArray();
        for (char koko : arr){
            System.out.println(koko);
        }
        String podzial[] = str.split(" ");
        for (String koko2 : podzial)
        System.out.println(koko2);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello World!").append(" test ");
        builder.append(192);
        System.out.println(builder);
        builder.insert(6,"INSERTED ");
        System.out.println(builder);
        builder.delete(12,18);
        System.out.println(builder);
    }
}
