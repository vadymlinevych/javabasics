package Task_03;

import java.util.Arrays;

/**
 3. Заполнить массив числами от 100 до 0
 */
public class Demo {
    public static void main(String args[]){

        int n = 101;
        int[] arr = new int[n];

        int i = n;
        while ( i > 0){
            i--;
            arr[n - i - 1] = i;
        }

        System.out.println(Arrays.toString(arr));

    }
}
