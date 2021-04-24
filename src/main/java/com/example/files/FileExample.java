package com.example.files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("files\\testFile.txt");
        if(!file.exists()){
            boolean fileCreated = file.createNewFile();
            System.out.println("Wynik utworzenia pliku: " + fileCreated);
        }
        else {
            System.out.println("Plik istnieje");
            System.out.println("Czy można czytać plik: " +file.canRead());
            System.out.println("Czy można zapisać do pliku: "+ file.canWrite());
            System.out.println("Czy plik jest zwykłym plikiem: " + file.isFile());
            System.out.println("Czy plik jest katalogiem: " + file.isDirectory());
            System.out.println("Czy plik jest plikiem: " +file.isFile());
            System.out.println("Nazwa pliku: " + file.getName() );
            System.out.println("Ścieżka pliku: " + file.getPath());
            System.out.println("Ścieżka pliku (absoultna): " + file.getAbsolutePath());
            System.out.println("Katalog w którym jest plik: " +file.getParent());
            System.out.println("Czy jest plikiem ukrytym: " + file.isHidden());
            long lastModified = file.lastModified();
            System.out.println("Ostatnio zmodyfikowany: " + (new Date(lastModified)));
            System.out.println("Wielkość pliku: " + file.length());


        }
        File filesDir = new File("files");
        if (filesDir.exists()){
            System.out.println("\nLista plików w katalogu: ");
            String files[] = filesDir.list();
            for (String f: files){
                System.out.println(f);
            }
        }
        File dir = new File("files\\test_dir");
        if(!dir.exists()){
            dir.mkdir();
        }
    }
}
