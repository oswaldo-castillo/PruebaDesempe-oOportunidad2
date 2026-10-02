package Ejercicio3;
/**
 * Gestiona el print de areas dependiendo el tipo de figura geometrica.
 */
public class ProcesadorGeometrico {

    /**
     * Imprime el area de la figura dependiendo de si es un triangulo u otra forma.
     *
     * @param figura objeto de tipo FiguraGeometrica 
     */
    public void imprimirArea(FiguraGeometrica figura) {
        /**
         * Se mantiene el figura instanceof Triangulo ya que en las especificaciones del 
         * sistema pide la diferenciacion de un triangulo con cualquier otra figura (aunque
         * solo esta disponible el rectangulo)
         */
        if (figura instanceof Triangulo) {
            System.out.println("Area del triangulo: " + figura.calcularArea());
        } else {
            // Como el if ya filtro los triangulos, aqui podemos asumir que es el rectangulo 
            // (o cualquier otra figura geometrica)
            System.out.println("Area de otra figura: " + figura.calcularArea());
        }
    }

    public static void main(String[] args) {
        ProcesadorGeometrico p = new ProcesadorGeometrico();
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.base = 4;
        rectangulo.altura = 5;

        Triangulo triangulo = new Triangulo();
        triangulo.base = 4;
        triangulo.altura = 5;

        p.imprimirArea(rectangulo);
        p.imprimirArea(triangulo);
    }
}