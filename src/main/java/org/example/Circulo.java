package org.example;

public class Circulo implements Figura {
    private final Double radio;
    private final String color;

    public Circulo(Double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }
}