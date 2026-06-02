package selectivas;

import java.util.Scanner;

public class InicioDeSecion {
    public static void main(String[] args) {
        Scanner entraDatos = new Scanner(System.in);
        System.out.println("Ingrese el usuario: ");
        String usuario = entraDatos.nextLine();

        System.out.println("Ingrese la clave: ");
        String clave = entraDatos.nextLine();
        String usuarioSistema = "marck";
        String claveSistema = "1539";

        if (usuario.equalsIgnoreCase(usuarioSistema)){
            System.out.println("usuario correcto");
            if (clave.equalsIgnoreCase(claveSistema)){
                System.out.println("acceso concedico");
                System.out.println("bienbenido al sistema");

            }else {
                System.out.printf("clave incorrecta");
            }
        } else {
            System.out.println("Usuario incorrecto");
        }




        entraDatos.close();
    }
}
