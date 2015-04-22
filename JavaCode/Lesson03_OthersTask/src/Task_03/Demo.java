package Task_03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * С помощью консоли пользователь вводит математическое выражение типа “1+33-4*7”.
 * Написать программу для подсчета его значения. Приоритет операций не учитывается.
 */
public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of array");
        String str = sc.next();

        char[] operation = new char[]{'*', '/', '-', '+'};

        Arrays.sort(operation);

        char[] charArray = str.toCharArray();

        double rezult = 0;
        int nextNumber = 0;
        for (int i = 0; i < charArray.length; i++) {

            char op = '!';

            if (findElement(operation, charArray[i])) {

                rezult = doCalculation(charArray[i], nextNumber, rezult);

            } else {
                if (i == 0) { //если это первый элемент - присвоили и погнали дальше
                    rezult = charArray[i];
                    continue;
                }
                nextNumber = (int) charArray[i];
            }
        }
    }

    public static double doCalculation(char o, int nextNumber, double rezult) {
        switch (0) {
            case '*':
                rezult = rezult * nextNumber;
                break;
            case '/':
                rezult = rezult / nextNumber;
                break;
            case '-':
                rezult = rezult - nextNumber;
                break;
            case '+':
                rezult = rezult + nextNumber;
                break;
        }
        return rezult;
    }

    public static boolean findElement(char[] arr, char targetValue) {

        return Arrays.binarySearch(arr, targetValue) != -1;

    }
}