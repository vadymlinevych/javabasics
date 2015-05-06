package Task_04;

import java.util.Arrays;
import java.util.Random;

/**
 4. Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего
 */
public class Demo {
    public static void main(String args[]) {
        int n = 10;
        int[] a = new int[n];
        Random r = new Random();

        for (int i = 0; i < a.length; i++)
            a[i] = r.nextInt();
        int sum = 0;

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (i != 0 && i != a.length - 1) sum += a[i];
        }

        System.out.println("Summa = " + sum);

    }
}
