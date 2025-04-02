package Git1;

import java.util.Random;

public class NumeroMasAlto {
    public static void main(String[] args) {
       int[] nums = new int[10];
        Random num = new Random();

        for (int i = 0; i < nums.length; i++){
            int numero = num.nextInt(99 - 11 + 1) + 11;
            nums[i] = numero;
        }

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        int max = nums[0];
        for (int i = 1 ; i < nums.length; i++){
            max = (max < nums[i]) ? nums[i] : max;
        }
        System.out.println("el numero maximo es: " + max);



    }
}
