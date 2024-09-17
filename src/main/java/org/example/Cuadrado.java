package org.example;

public class Cuadrado implements Figura{
    private final Double lado;
    private final String color;

    public Cuadrado(Double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    public Double getLado() {
        return lado;
    }

    public String getColor() {
        return color;
    }

}