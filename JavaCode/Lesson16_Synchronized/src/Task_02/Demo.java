package Task_02;

import java.util.Arrays;

/**
 * 2. Написать код для многопоточного подсчета суммы элементов массива целых чисел.
 * Сравнить скорость подсчета с простым алгоритмом.
 */

public class Demo extends Thread {

    public static void main(String[] args) throws InterruptedException {
        int n = 100_000_000;
        int step = 25_000_000;
        int numberOfThreads = n / step;
        int sum = 0;
        int[] arr = new int[n];

        Arrays.fill(arr, 1);

        //variant 1 -single threading calculation
        GetTime gt0 = new GetTime();
        for (int i = 0; i <= n-1; i++)
            sum += arr[i];
        System.out.println("VARIANT1: Total sum is " + sum);
        System.out.println("VARIANT1:Time " + ((new GetTime()).time - gt0.time));
        //

        //variant 2 - Multi-threading calculation
        GetTime gt1 = new GetTime();
        sum = ArrayCounter.getSum(arr, numberOfThreads);
        GetTime gt2 = new GetTime();
        //

        System.out.println("VARIANT2: Total sum is " + sum);
        System.out.println("VARIANT2: Number of Thread " + numberOfThreads);
        System.out.println("VARIANT2:Time " + (gt2.time - gt1.time));

    }


}
