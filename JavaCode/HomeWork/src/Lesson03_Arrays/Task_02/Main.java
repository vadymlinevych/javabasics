package Lesson03_Arrays.Task_02;

import java.util.Arrays;
import java.util.Scanner;

/**
 1. Задать массив целых чисел длинной N эл.
 2. Поменять 1-й и последний элемент местами.
 3. Вывести массив на экран.
 */
public class Main {

    public static void main(String[] args) {

        int n = 5;
        int[] ar = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Intitial array is " + Arrays.toString(ar));

        int el_0 = ar[0];

        ar[0] = ar[ar.length - 1];
        ar[ar.length - 1] = el_0;

        System.out.println("New array is" + Arrays.toString(ar));

    }
}
