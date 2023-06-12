package com.salesianos.actividad4;

public class Mesa {
    private String color;
    private  int numeroPatas;

    public Mesa(String color, int num_patas) {
        this.color = color;
        this.numeroPatas = num_patas;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Número de patas: " + numeroPatas;
    }

    


}
