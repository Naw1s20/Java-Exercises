package Git1;

import java.util.Scanner;


public class ManejoDeNombres2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreM = "" ;

        for (int i = 0; i < 3; i++){
            System.out.println("Inserte un nombre: ");
            String nombre = sc.nextLine();
            nombreM +=  nombre.substring(1,2).toUpperCase()+"."+nombre.substring(nombre.length()-2);
            if (i < 2){
                nombreM += "_";
            }


        }
        System.out.println(nombreM);
        }


    }

