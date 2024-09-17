package org.example;

import java.util.List;
import java.util.Objects;

public class ServicioFiguras {

    public Double calcularArea(Figura figura) {
        Double area;
        switch (figura) {
            case Circulo(Double radio, String color) when Objects.equals(color, "rojo") -> {
                 area = Math.PI * radio * radio;
            }
            case Triangulo(Double base, Double altura, String color) when Objects.equals(color, "azul") -> {
                 area = (base * altura) / 2;
            }
            case Cuadrado(Double lado, String color) when Objects.equals(color, "verde") -> {
                 area = lado * lado;
            }
            case Cuadrado(Double lado, String color) when Objects.equals(color, "azul") -> {
                area = 2 * (lado * lado);
            }
            default -> area = 0.0;
        }
        return area;
    }

    public Double sumarAreas(List<Figura> figuras) {
        Double sumaTotal = 0.0;
        for (Figura figura : figuras) {
            sumaTotal += calcularArea(figura);
        }
        return sumaTotal;
    }
}
