package selectivas;

import java.util.Scanner;

public class EjercicioProducto {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("Ingrese el costo del Producto");
        double costo = entradaDatos.nextDouble();

        if (costo > 200){
            System.out.println("Se paga en efectivo");
        } else {
            System.out.printf("se paga con tarjeta");
        }

        entradaDatos.close();
    }
}
