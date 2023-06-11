package com.salesianos.actividad1;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String texto = "";
        final int LONGITUD_MINIMA = 30;
        FileWriter fileWriter = new FileWriter("src/com/salesianos/ficheros/actividad1.txt");

        while(texto.length() < LONGITUD_MINIMA){
            System.out.println("Introduce el texto: ");
            texto = scanner.nextLine();
            if (texto.length() < LONGITUD_MINIMA){
                System.out.println("Faltan: " + (LONGITUD_MINIMA - texto.length() + "caracteres"));
            }
        }

        String textoFormateado = texto.toLowerCase().replace(" ","_");
        System.out.println(textoFormateado);
        fileWriter.write(textoFormateado);
        fileWriter.close();
        scanner.close();
    }
}