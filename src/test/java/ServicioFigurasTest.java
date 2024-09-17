import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

class ServicioFigurasTest {

    @Test
    public void testSumarAreasDiferentesColores() {
        ServicioFiguras servicioFiguras = new ServicioFiguras();

        List<Figura> figuras = Arrays.asList(
                new Circulo(3.0, "rojo"),
                new Triangulo(4.0, 5.0, "azul"),
                new Cuadrado(2.0, "verde"),
                new Circulo(5.0, "amarillo"),
                new Triangulo(3.0, 4.0, "morado"),
                new Cuadrado(4.0, "negro"),
                new Cuadrado(3.0, "azul")
        );

        assertEquals(60.27, servicioFiguras.sumarAreas(figuras), 0.5);
    }
}