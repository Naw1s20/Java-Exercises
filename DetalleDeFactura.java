package Git1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.Scanner;
public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre de su factura: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca el precio del primer producto: ");
        float item1 = sc.nextFloat();

        System.out.println("Introduzca el precio del segundo producto: ");
        float item2 = sc.nextFloat();

         float totalBruto = item1 + item2;
         float impuesto = totalBruto * 0.19f;
         float totalNeto = totalBruto + impuesto;
            System.out.println("La factura con nombre " + nombre + " tiene un coste de "
                    + totalBruto + " con unos impuestos de: "+impuesto+ " que asciende a "+totalNeto);

    }
}
