package Git1;

import java.util.Scanner;

public class MediasNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte los numeros ya sean positvos o negativos.");
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;
        int totalPositivos = 0;
        int totalNegativos = 0;

        int[] todos = new int[7];
        for (int i = 0; i< todos.length; i++){
            todos[i] = sc.nextInt();
            if (todos[i] > 0){
                positivos++;
                totalPositivos += todos[i];
            } else if (todos[i] < 0) {
                negativos++;
                totalNegativos -= todos[i];

            }else {
                ceros++;
            }

        }
        System.out.println("la media de positivos es: " + totalPositivos/positivos+ " habiendo " + positivos + " en total" );
        System.out.println("la media de negativos es: " + totalNegativos/negativos+ " habiendo " + negativos + " en total" );
        System.out.println("hay: " + ceros + " en total" );


    }
}
