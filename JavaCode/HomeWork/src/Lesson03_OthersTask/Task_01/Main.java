package Lesson03_OthersTask.Task_01;

import java.util.Arrays;

/**
 * Написать метод, который заполнит массив произвольного размера числами по возрастанию, начиная с центра массива,
 * например, [5,4,3,2,1,0,1,2,3,4,5] для N = 6.
 */
public class Main {
    public static void main(String args[]) {

        int n = 6;
        int N = n * 2 - 1;
        int[] arr = new int[N];

        arr[n - 1] = 0;

        for (int i = n; i < n * 2 - 1; i++) {
            arr[i] = i - n + 1;
            arr[N - i - 1] = i - n + 1;
        }

        System.out.println(Arrays.toString(arr));

    }
}
