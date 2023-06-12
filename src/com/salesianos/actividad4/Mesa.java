package com.salesianos.actividad4;

import java.io.Serializable;

public class Mesa implements Serializable {
    private String color;
    private int numeroDePatas;

    public Mesa(String color, int numeroDePatas) {
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "color='" + color + '\'' +
                ", numeroDePatas=" + numeroDePatas +
                '}';
    }
}