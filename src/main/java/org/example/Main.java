package org.example;

public class Main {
    public static void main(String[] args) {




    }

    private static void instanceOf(Object obj) {
        if (obj instanceof Circulo circulo) {
            System.out.println("Es un círculo con radio " + circulo.radio());
        } else if (obj instanceof Cuadrado cuadrado) {
            System.out.println("Es un cuadrado con lado " + cuadrado.lado());
        } else if (obj instanceof Triangulo triangulo) {
            System.out.println("Es un triángulo con base " + triangulo.base() + " y altura " + triangulo.altura());
        }
    }
}