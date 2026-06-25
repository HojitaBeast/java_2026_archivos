package estructura_datos;

public class Arreglos {
    public static void main(String[] args) {
        //definir el tamaño del arreglo
        int N = 10;
        int[] arreglo = new int[N];

        //inicio de las variables
        double suma = 0;
        double media = 0;

        //bucle para for desde 0 hasta N-1
        for (int i = 0; i <= N - 1; i++){
            arreglo[i] = i;
            suma  = suma + arreglo[i];
            System.out.println(arreglo[i]);
        }
        //impresion de resulltados

        System.out.println("La suma es " + suma);
        media = suma / N;
        System.out.println("La media es " + media);
    }
}
