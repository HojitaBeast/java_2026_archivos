package bucles;

public class EjerciciosFor {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1 ; i <= 100 ; i++){
            total = i + total;

        }
        System.out.println("total de la suma" + total);
    }
}
