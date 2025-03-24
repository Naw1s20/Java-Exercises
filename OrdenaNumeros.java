package Git1;
import java.util.Scanner;
public class OrdenaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("inserte un numero");
        int num1 = sc.nextInt();
        System.out.println("inserte un numero");
        int num2 = sc.nextInt();
        int[] numOrdenados = new int[2];
        numOrdenados[0] = num1 > num2 ? num1:num2;
        numOrdenados[1] = num1 < num2 ? num1:num2;
        for (int i = 0; i<numOrdenados.length;i++){
            System.out.println(numOrdenados[i]);
        }

    }
}
