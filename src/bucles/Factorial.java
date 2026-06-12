package bucles;

public class Factorial {
    public static void main(String[] args) {
        int factorial5 = 1;
        for (int numero = 1 ; numero <= 5 ; numero++){
            factorial5 = factorial5 * numero;
            System.out.println("En esta vuesta es: " + factorial5);
        }
        int factorial6 = 1;
        for (int numero = 1 ; numero <= 6 ; numero++){
            factorial6 = factorial6 * numero;
            System.out.println("En esta vuelta es: " + factorial6);
        }
        System.out.println("=========================");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("El factorial de 5 es: " + factorial5);
        System.out.println("El factorial de 5 es: " + factorial6);
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        System.out.println("=========================");

    }
}
