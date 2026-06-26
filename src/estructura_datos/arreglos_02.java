package estructura_datos;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arreglos_02 {
    public static void main(String[] args) {
        //creando mi arreglo de numeros
        /*
        int[] numeros = new int[cantidad de elementos o tamaño];
         */
        int[] numeros = new int[6];
        numeros[0] = 10;
        numeros[1] = 8;
        numeros[2] = 15;
        numeros[3] = 0;
        numeros[4] = 20;
        numeros[5] = 12;
        System.out.println(Arrays.toString(numeros));

        //arreglo con inicializacion
        int[] notas = {10,18,13,15,20,16,18,14,12,12};
        //System.out.println(Arrays.toString(notas));
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
        for (int i = 0; i <= notas.length; i++){
            System.out.println(Arrays.toString(notas));
        }
        String[] frutas = {"platano","pera","manzana","duraszno","fresas"};
        System.out.println(Arrays.toString(frutas));
        /*
        list<TipoDtato> nombreLista = new arregloLista
         */
        List<String> fruits= new ArrayList<>();
        fruits.add("Piña");
        fruits.add("fresas");
        fruits.add("platano");
        fruits.add("mango");
        fruits.add("durazno");
        for (int i = 0 ; i <= fruits.size();i++){
            System.out.println(fruits.get(i));
        }


    }
}
