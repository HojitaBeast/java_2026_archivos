package selectivas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DescuentoMembresia {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Ingrese el monto");
        double montoCompra = entradaDatos.nextDouble();

        System.out.println("Tiene menbresia? Si/No: ");
        String membresia = entradaDatos.nextLine().toLowerCase();

        if (montoCompra >= 500){
            if (membresia.equalsIgnoreCase("sI")){
                System.out.println("Tu descuento es 20%: ");
                double descuento = montoCompra * 1.20;
                descuento = montoCompra - descuento;
            }else {
                double descuento = montoCompra *1.10;
                descuento = montoCompra - descuento;
                System.out.println("Tu descuento es 10%: "+ descuento);
            }
        }else {
            System.out.println("No tiene descuento");
        }


        entradaDatos.close();
    }
}
