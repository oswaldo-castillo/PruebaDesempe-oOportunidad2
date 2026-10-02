package Ejercicio3;
/**
 * Representa una figura geometrica para el calculo de areas
 */
public abstract class FiguraGeometrica {
    public double base;
    public double altura;

    /**
     * Calcula el area de la figura geometrica correspondiente
     *
     * @return calcularArea para el area calculada de x figura
     */
    public abstract double calcularArea();
}
