package selectivas;

import java.util.Scanner;

public class Anidadas {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        System.out.printf("Ingrese la calficación: ");
        int aclificacion = entradaDatos.nextInt();

        if (aclificacion >= 13){
            System.out.println("Aprobaste");
            if (aclificacion >= 15){
                System.out.println("Felicidades");
                if (aclificacion >=18 && aclificacion <= 20){
                    System.out.printf("Obtubiste una buena calificacion");
                }
            }
        }else {
            System.out.printf("Desaprobaste, sigue estudiando");
        }

        entradaDatos.close();
    }
}
