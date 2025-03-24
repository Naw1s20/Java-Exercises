package Git1;
/*
Este ejercicio se puede optimizar
usando el metodo replace, además esta diseñado para tener que insertar un nombre y un apellido, si no, dará error.

 */
import java.util.Scanner;

public class LongitudNombres {
    public static void main(String[] args) {
        String nombre1 = "", nombre2="", nombre3="";
        Scanner sc = new Scanner(System.in);

            System.out.println("Inserte un nombre");
            nombre1 = sc.nextLine().strip();
            System.out.println("Inserte un nombre");
            nombre2 = sc.nextLine().strip();
            System.out.println("Inserte un nombre");
            nombre3 = sc.nextLine().strip();




        String nombr1 = nombre1.substring(0, nombre1.indexOf(" ")) + nombre1.substring(nombre1.indexOf(" ") + 1);
        String nombr2 = nombre2.substring(0, nombre2.indexOf(" ")) + nombre2.substring(nombre2.indexOf(" ") + 1);
        String nombr3 = nombre3.substring(0, nombre3.indexOf(" ")) + nombre3.substring(nombre3.indexOf(" ") + 1);
        if (nombr1.length() > nombr2.length() && nombr1.length() > nombr3.length()) {
            System.out.println(nombre1 + " es el nombre mas largo");
        } else if (nombr1.length() < nombr2.length() && nombr2.length() > nombr3.length()) {
            System.out.println(nombre2 + " es el nombre mas largo");

        } else {
            System.out.println(nombre3 + " es el nombre mas largo");

        }
    }

}
