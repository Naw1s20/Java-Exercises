package Git1;
import java.util.Scanner;
public class DepositoGasolina {
    public static void main(String[] args) {
        System.out.println("inserte cuantos listros tiene en su deposito");
        Scanner sc = new Scanner(System.in);
        int litrosActuales = sc.nextInt();
        if (litrosActuales == 70){
            System.out.println("Depósito lleno");
        }else if(60 <= litrosActuales && litrosActuales < 70){
            System.out.println("Depósito casi lleno");

        }else if(40 <= litrosActuales && litrosActuales < 60){
            System.out.println("Depósito 3/4");
        }else if(35 <= litrosActuales && litrosActuales < 40){
            System.out.println("Depósito a la mitad");
        }else if(20 <= litrosActuales && litrosActuales < 35){
            System.out.println("Suficiente");
        }else if(1 <= litrosActuales && litrosActuales < 20){
            System.out.println("Insuficiente");
        }
    }
}
