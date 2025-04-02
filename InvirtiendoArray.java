package Git1;

import java.util.Scanner;

public class InvirtiendoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.println("introduzca 10 numeros: ");
        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");


        }
        for (int i = 0; i < (nums.length) / 2; i++) {
            int temp = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[i];
            nums[i] = temp;


        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");


        }
    }
}
