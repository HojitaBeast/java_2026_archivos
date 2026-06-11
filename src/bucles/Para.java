package bucles;

import javax.print.attribute.standard.Finishings;

public class Para {
    public static void main(String[] args) {
        for (int i = 10 ; i >= 0 ; i--){
            System.out.println("en esta vuelta ahora es: " +i);
        }

        for (int i = 2 ; i <= 10 ; i = i + 2){
            System.out.println("creciente en pares " + i);
        }

        for (int i = 10 ; i >= 0 ; i = i -2){
            System.out.println("decreciente en pares " + i);
        }

        for (int i = 0 ; i < 3 ; i++){
            System.out.println("el mensaje a repetir");
        }

        int numero = 5;
        for (int i = 1 ; i >= 1 && i <= 12 ; i++){
            System.out.println(numero + "X" + i + "=" + numero * i);
        }


    }
}
