package Git1;
import javax.swing.*;
import java.util.Scanner;
public class MultiplicarSinMultiplicador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el primer numero");
        int num1 = sc.nextInt();
        System.out.println("introduzca el primer numero");
        int num2 = sc.nextInt();
        int resultado = 0;
        for (int i = 0; i< num2;i++){
            resultado += num1;
        }
        System.out.println("El resultado final es: " + resultado);

        int confirmacion = num1 * num2;
        System.out.println(confirmacion);

        JOptionPane.showInputDialog("pulse 1 para actualizar \n Pulse 2 para cerrar ");
    }
}
