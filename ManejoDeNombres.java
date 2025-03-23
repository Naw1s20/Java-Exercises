package Git1;

import java.util.Locale;
import java.util.Scanner;


public class ManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres[]= new String[3];

        for (int i = 0; i< nombres.length; i++){
            System.out.println("Inserte un nombre: ");
            String nombre = sc.nextLine();
            String nombreM = "" ;
            char[] nom = nombre.toCharArray();
            nombreM += nom[1];
            nombreM= nombreM.toUpperCase();
            nombreM+=".";
            nombreM+=nom[nom.length-2];
            nombreM+=nom[nom.length-1];
            nombres[i] = nombreM;

        }
        System.out.println("nombres[0] = " + nombres[0]);
        System.out.println("nombres[1] = " + nombres[1]);
        System.out.println("nombres[2] = " + nombres[2]);


    }
}
