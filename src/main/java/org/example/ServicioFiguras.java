package org.example;

import java.util.List;

public class ServicioFiguras {

    //Solo sumar al area total si:
        // -El circulo es rojo || area = Math.PI * radio * radio;
        // -El triangulo es azul || area = (base * altura) / 2;
        // -El cuadrado es verde || area = lado * lado;
    // - Si el cuadrado es azul, multiplicar su area por 2 || area = 2 * (lado * lado);


    public Double calcularArea(Figura figura) {
       //TODO Codigo aca
        return null;
    }


    public Double sumarAreas(List<Figura> figuras) {
        Double sumaTotal = 0.0;
        for (Figura figura : figuras) {
            sumaTotal += calcularArea(figura);
        }
        return sumaTotal;
    }
}
