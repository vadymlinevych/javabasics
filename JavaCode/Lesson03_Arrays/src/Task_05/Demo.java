package Task_05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * - Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
 * - Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его элементами,
 * а затем выводить нужный элемент по его индексу на консоль.
 */

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of array");
        int n = sc.nextInt();

        int[] ar = new int[n];
        int[] br = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Input the value of " + i + " element of array = ");
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

        System.out.println("Initial array is " + Arrays.toString(ar));

        for (int i = 0; i < n; i++) {
            br[i] = ar[n - i - 1];
        }

        System.out.println("Inverted array is " + Arrays.toString(br));

        System.out.println("Input index of element to see the value =");
        int j = sc.nextInt();

        if (0 < j && j < n) {
            System.out.println("The value is " + ar[j]);
        } else {
            System.out.println("Incorrect index");
        }


    }
}
