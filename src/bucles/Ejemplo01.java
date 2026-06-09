package bucles;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        String nombreUsuario = "";
        String clave = "";
        while (!nombreUsuario.equals("juan") || !clave.equals("1539")){
            System.out.println("Ingrese su nombre de usuario: ");
            nombreUsuario = entradaDatos.nextLine();
            System.out.println("Ingrese su clave: ");
            clave = entradaDatos.nextLine();

            if (!nombreUsuario.equals("juan") || !clave.equals("1539")){
                System.out.println("Datos incorrectos");
            }
        }
        System.out.println("Bienbenido al sistema");


        entradaDatos.close();
    }
}
