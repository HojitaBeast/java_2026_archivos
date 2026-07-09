package estructura_datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaContacto {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        List<String> contactos = new ArrayList<>();

        System.out.println("Cuantos contactos deseas agregar?: ");
        int cantidad = entradaDatos.nextInt();
        entradaDatos.nextLine();
        for (int i = 0 ; i < cantidad ; i++){
            System.out.println("Ingrese el nombre de contacto " + (i + 1) + ": ");
            String nombre = entradaDatos.nextLine();
            contactos.add(nombre);
        }

        entradaDatos.nextLine();
        System.out.println("Lista de contactos");
        for (int i = 0 ; i < contactos.size() ; i++){
            System.out.println((i + 1) + ". " + contactos.get(i));
        }

        System.out.println("=========================================");
        System.out.println("==========Busqueda de contactos==========");
        System.out.println("Ingrese el contacto que quiera buscar");
        String nombreContacto = entradaDatos.nextLine().toLowerCase();
        if (contactos.contains(nombreContacto)){
            System.out.println("El nombre " + nombreContacto + " Si existe");
        }else {
            System.out.println("El nombre " + nombreContacto + " No existe");
        }

        entradaDatos.close();
    }
}
