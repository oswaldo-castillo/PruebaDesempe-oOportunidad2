/**
 * Procesa arreglos de datos numericos para realizar operaciones matematicas.
 */
public class ProcesadorSumas {

    /**
     * Recorre un arreglo y suma sus elementos omitiendo los numeros negativos.
     *
     * @param datos arreglo de numeros enteros que sera procesado
     * 
     */
    public static int sumarNumerosPositivos(int[] datos) {
        int sumaPositivos = 0;
        /**
        * Se cambio por un ciclo for en vez del while
        */
        for (int i = 0; i < datos.length; i++) {
            /**
            * Uso del if para evitar la suma de negativos
            */
            if (datos[i] < 0) {
                System.out.println("Valor negativo encontrado, se omite");
            } else {
                sumaPositivos += datos[i];
            } 
        }
        /**
        * @return la suma total de los numeros positivos procesados
        */
        return sumaPositivos;
    }

    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};
        int resultado = sumarNumerosPositivos(datos);
        System.out.println("Suma total: " + resultado);
    }
}