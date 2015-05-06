package Task_06;

import java.util.Arrays;
import java.util.Scanner;

/** 6
 * 1. Ввести с клавиатуры массив из 10 чисел.
 * 2. Разбить его на 2 массива равной длинны.
 * 3. Отсортировать каждую из половинок и вывести их содержимое на экран
 */
public class Demo {

    public static void main(String[] args) {

        int n = 6;
        int[] ar = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ar));

        int lengthOfFirstArray = (int) (n / 2);

        int[] ar1 = Arrays.copyOf(ar, lengthOfFirstArray);
        int[] ar2 = Arrays.copyOfRange(ar, lengthOfFirstArray, ar.length);

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

    }
}
