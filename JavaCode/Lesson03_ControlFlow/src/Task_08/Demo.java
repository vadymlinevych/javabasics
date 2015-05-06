package Task_08;


        import java.util.Scanner;

/**
 * Найти в массиве число, которое повторяется наибольшее количество раз, не применяя сортировку.
 */
public class Demo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of array");
        int n = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input the value of " + i + " element of array = ");
            ar[i] = sc.nextInt();
        }

        int max = 0;
        int I = 0;
        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    k++;
                    if (k > max) {
                        max = k;
                        I = i;
                    }
                }
            }
        }

        System.out.println("Число " + ar[I] + " входит в массив " + max + " раз(а)");

    }

}
