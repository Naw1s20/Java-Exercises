package Git1;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[20];
        double sumaMayores5 = 0, sumaMenores5 = 0, sumaTotal = 0;
        int contMayores5 = 0, contMenores5 = 0, contNotas1 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Inserte la nota del alumno " + (i+1) + " (del 1 al 7):");
            notas[i] = sc.nextDouble();

            if (notas[i] == 0) {
                System.out.println("Error: Se ingresó una nota 0. El programa se cerrará.");
                return;
            }

            sumaTotal += notas[i];

            if (notas[i] >= 5) {
                sumaMayores5 += notas[i];
                contMayores5++;
            } else if (notas[i] < 5) {
                sumaMenores5 += notas[i];
                contMenores5++;
            }

            if (notas[i] == 1) {
                contNotas1++;
            }
        }

        double promedioMayores5 = contMayores5 > 0 ? sumaMayores5 / contMayores5 : 0;
        double promedioMenores5 = contMenores5 > 0 ? sumaMenores5 / contMenores5 : 0;
        double promedioTotal = sumaTotal / 20;

        System.out.println("Promedio de notas mayores a 5: " + promedioMayores5);
        System.out.println("Promedio de notas menores a 5: " + promedioMenores5);
        System.out.println("Cantidad de notas 1: " + contNotas1);
        System.out.println("Promedio total de la clase: " + promedioTotal);
    }
}





