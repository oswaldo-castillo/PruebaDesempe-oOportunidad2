

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    // ERROR: La declaracion de variables debe de ir antes
    // ERROR: La variable cliente no cuenta con un valor anterior
    public static void eliminarInactivos(List<String> clientes, String inactivo) {
        for (String cliente : clientes) {
            // ERROR: Como inactivo no tiene un valor string para comparar, el if nunca se activa
        // por lo tanto, no regresa nada
            if (cliente == inactivo) {
                clientes.remove(cliente);
            }
        }
    }

    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add(new String("Pedro"));
        eliminarInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}