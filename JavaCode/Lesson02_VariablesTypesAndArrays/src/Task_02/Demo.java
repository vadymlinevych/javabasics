package Task_02;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Задать массив целых чисел длинной 10 эл.
 * 2. Отсортировать числа в массиве
 * 3. Вывести на экран результат.
 * 4. Сделать возможность наполнения массива с клавиатуры*.
 */
public class Demo {
    public static void main(String[] args) {

        int n = 10;
        int[] ar = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

        System.out.println(Arrays.toString(ar));

    }

}
