package com.salesianos.actividad3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        File archivo;

        BufferedReader bufferedReader1 = new BufferedReader(
                new FileReader("src/com/salesianos/ficheros/actividad1.txt"));

        BufferedReader bufferedReader2 = new BufferedReader(
                new FileReader("src/com/salesianos/ficheros/actividad2.txt"));

        FileWriter fileWriter = new FileWriter("src/com/salesianos/ficheros/actividad3.txt");

        try {
            archivo = new File("src/com/salesianos/ficheros/actividad3.txt");
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado");
            }
        } catch (Exception e) {
            System.out.println("Archivo no creado");
        }

        fileWriter.write("actividad1: " + bufferedReader1.readLine() + "\n");
        fileWriter.write("actividad2: " + bufferedReader2.readLine() + "\n");

        bufferedReader1.close();
        bufferedReader2.close();
        fileWriter.close();
    }
}