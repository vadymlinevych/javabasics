package Task_04;

import java.util.Arrays;
import java.util.Scanner;

/**
 Среднее арифметическое элементов массива.
 */
public class Demo {

    public static void main(String[] args) {

        int n = 4;
        int[] ar = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ar));

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum +=ar[i];
        }

        float averageValue = (ar.length == 0) ? 0 : (float)sum/ar.length;

        System.out.println("The average is " + averageValue);
    }
}
