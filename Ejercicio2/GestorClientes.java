import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona las operaciones en una listas de clientes.
 */
public class GestorClientes {

    /**
     * Elimina de la lista a todos los clientes que coincidan con el parametro inactivo.
     *
     * @param clientes lista de nombres de los clientes
     * @param inactivo nombre del cliente que se desea eliminar
     */
    public static void eliminarInactivos(List<String> clientes, String inactivo) {
        /**
         * Nueva variable llamada clienteActual
         */
        String clienteActual;
        /**
        * Se mantiene el for, se agregan más parametros
        */
        for (int i = 0; i < clientes.size(); i++) {
            clienteActual = clientes.get(i);
            /**
            * if para poder eliminar los clientes de una lista
            */
            if (clienteActual.equals(inactivo)) {
                clientes.remove(i);
                //i-- para evitar un problema por el cambio de elementos de un string
                i--;
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