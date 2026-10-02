package Ejercicio3;
// ERROR: Sin Javadoc de clase
// ERROR: Sin Javadoc (proposito, param, enum)
// ERROR: Nombre generico para la clase Figura 
// ERROR: La clase Figura esta dentro de otra clase, se recomienda hacer un archivo por clase
public class Figura {
    public double base;
    public double altura;

    public double calcularArea() {
        return base * altura;
    }
}
// ERROR: Nombre generico para la clase Figura 
// ERROR: La clase Triangulo esta dentro de otra clase, se recomienda hacer un archivo por clase
public class Triangulo extends Figura {
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
// ERROR: Falta la clase Rectangulo (o ponerla en la clase Figura con Triangulo)
// ERROR: Nombre generico para la clase Procesador 
// ERROR: La clase Procesador esta dentro de otra clase, se recomienda hacer un archivo por clase
public class Procesador {
    public void imprimirArea(Figura figura) {
        if (figura instanceof Triangulo) {
            // ERROR: El objeto t de la clase Triangulo se puede instanciar con un this
            Triangulo t = (Triangulo) figura;
            System.out.println("Área del triángulo: " + t.calcularArea());
        } else {
            //ERROR: Se recomienda poner Area del rectangulo
            //ERROR: Se recomienda hacer un caso para el rectangulo, de esta manera
            //se puede implementar otra figura si asi lo desea
            System.out.println("Área: " + figura.calcularArea());
        }
    }

    public static void main(String[] args) {
        Procesador p = new Procesador();
        Figura rectangulo = new Figura();
        rectangulo.base = 4;
        rectangulo.altura = 5;

        Triangulo triangulo = new Triangulo();
        triangulo.base = 4;
        triangulo.altura = 5;

        p.imprimirArea(rectangulo);
        p.imprimirArea(triangulo);
    }
}
