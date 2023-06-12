package com.salesianos.actividad4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MesaManager mesaManager = new MesaManager("src/com/salesianos/ficheros/actividad4.txt");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el color de la mesa: ");
                    String color = scanner.next();
                    System.out.print("Ingrese el número de patas de la mesa: ");
                    int numeroDePatas = scanner.nextInt();
                    Mesa mesa = new Mesa(color, numeroDePatas);
                    try {
                        mesaManager.guardarMesa(mesa);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        ArrayList<Mesa> mesas = mesaManager.obtenerMesas();
                        for (Mesa m : mesas) {
                            System.out.println(m);
                        }
                    } catch (IOException e) {
                        System.out.println("Error al mostrar mesas.");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
