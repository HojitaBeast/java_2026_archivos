package bucles;

import java.util.Scanner;

public class CalcularGastos {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double total = 0;
        int cantidad = 0;

        // Entrada de datos
        System.out.println("Ingresa un gasto");
        double gasto = entradaDatos.nextDouble();


        // uso el mientras
        while (gasto != 0){
            total = total + gasto;
            cantidad = cantidad + 1;
            System.out.println("Ingresa otro gasto");
            gasto = entradaDatos.nextDouble();
        }
        // muestro la salida de datos
        System.out.println("El gasto total: S/. " + total);
        System.out.println("En total tienes: " + cantidad + " gastos");
        entradaDatos.close();
    }
}
