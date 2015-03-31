package Lesson03_ControlFlow.Task_01;

/**
 Вывести на экран числа от 10 до 20 с помощью всех известных циклов.
 */
public class Main {
    public static void main(String args[]){

        System.out.println("1. For...");
        for (int i = 10; i <=20; i++) {
            System.out.println(i);
        }

        System.out.println("2. Do...");

        int i = 10;
        do{
            System.out.println(i++);
        } while (i<=20);

        System.out.println("3. While...");

        i = 10;
        while (i<=20){
            System.out.println(i++);
        };

    }
}
