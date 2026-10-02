package Ejercicio3;

/**
 * Representacion de un rectangulo y su formula para calcular su area.
 */
public class Rectangulo extends FiguraGeometrica {

    /**
     * Ejecuta la formula para obtener el area del rectangulo
     *
     * @return el area del rectangulo
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }
}