package bucles;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner tablaMultiplicar = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = tablaMultiplicar.nextInt();
        int contador = 1;

        while (contador <= 12){

            System.out.println(num + " X " + contador + " = " + num*contador);
            contador++;
        }
        tablaMultiplicar.close();
    }
}
