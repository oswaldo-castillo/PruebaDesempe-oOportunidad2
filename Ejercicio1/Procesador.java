// ERROR: Sin Javadoc de clase
// ERROR: Sin Javadoc (proposito, param, enum)
// ERROR: nombre generico ("Procesador" no dice que procesa)
public class Procesador {
    // ERROR: nombre generico ("procesar" no dice que procesa)
    public static void procesar(int[] datos) {
        int i = 0;
        // ERROR: nombre generico para el dato suma
        int suma = 0;
        // ERROR: El while esta abierto y nunca cierra
        while (i < datos.length) {
            suma += datos[i];
            // ERROR: el continue hace que el sistema siga ejecutando el mismo numero negativo
            if (datos[i] < 0) {
                // ERROR: El x: no debe estar ahi
                System.out.println("Valor negativo encontrado, se omite");
            }
            // ERROR: Se puede declarar el i++ dentro del while
            i++;
        }
        System.out.println("Suma total: " + suma);
    }

    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};
        procesar(datos);
    }
}