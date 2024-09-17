package org.example;

public class Triangulo implements Figura {
    private final Double base;
    private final Double altura;
    private final String color;

    public Triangulo(Double base, Double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }
}