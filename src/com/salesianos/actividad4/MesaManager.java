package com.salesianos.actividad4;

import java.io.*;
import java.util.ArrayList;

public class MesaManager {

    private String nombreArchivo;

    public MesaManager(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardarMesa(Mesa mesa) throws IOException {
        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {
            writer.write(mesa.getColor() + "," + mesa.getNumeroDePatas() + "\n");
        }
    }

    public ArrayList<Mesa> obtenerMesas() throws IOException {
        ArrayList<Mesa> mesas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 2) {
                    mesas.add(new Mesa(parts[0], Integer.parseInt(parts[1])));
                }
            }
        }
        return mesas;
    }
}
