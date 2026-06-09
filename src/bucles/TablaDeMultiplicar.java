package bucles;


import java.util.Scanner; // 1. Faltaba importar el Scanner

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("1: Suma, 2: Resta, 3: Multiplicar, 4: Division, 5: Salir");
            System.out.print("Elija una opcion: ");
            opcion = entradaDatos.nextInt();

            if (opcion >= 1 && opcion <= 4){
                System.out.print("Ingrese el primer numero: ");
                double n1 = entradaDatos.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                double n2 = entradaDatos.nextDouble();

                switch (opcion){
                    case 1:
                        System.out.println("Resultado: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (n1 * n2));
                        break;
                    case 4:
                        if (n2 != 0){
                            System.out.println("Resultado: " + (n1 / n2));
                        } else {
                            System.out.println("Error: No es divisible entre 0");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opcion erronea.");
            }

        } while (opcion != 5);
        entradaDatos.close();
    }
}