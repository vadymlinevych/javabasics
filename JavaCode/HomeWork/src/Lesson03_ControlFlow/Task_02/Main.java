package Lesson03_ControlFlow.Task_02;

/**
 Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
 */
public class Main {
    public static void main(String args[]){

        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }

    }
}
