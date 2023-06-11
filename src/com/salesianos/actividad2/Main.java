package com.salesianos.actividad2;

import java.io.FileReader;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        FileReader lecturaArchivo = new FileReader("src/com/salesianos/ficheros/actividad2.txt");
        File archivo = new File("src/com/salesianos/ficheros/actividad2.txt");

        long tamTexto = archivo.length();
        for (int i = 0; i < tamTexto; i++) {
            int caracter = lecturaArchivo.read();
            if (caracter != -1) {
                System.out.print((char)caracter + "_" + caracter + ", ");
            }
        }
    }
}
