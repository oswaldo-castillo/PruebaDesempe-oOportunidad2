package Ejercicio3;
/**
 * Representacion de un triangulo y su formula para calcular su area.
 */
public class Triangulo extends FiguraGeometrica {

    /**
     * Ejecuta la formula para obtener el area del triangulo
     *
     * @return el area del triangulo
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}