package Task_03;

import java.util.Scanner;

/**
 3. Создать поток, который будет каждые 10 секунд выводить текущее время на экран.
 Сделать возможность прерывания потока с помощью команды с консоли.
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("To finish, please, enter \"stop\"");

        Thread thread = new ThreadShowTime();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        String str;
        try {

            while (true) {
                str = scanner.nextLine();
                if (str.equalsIgnoreCase("stop")) {
                    thread.interrupt();
                    System.out.println("Sorry, but the tread has been interrupted!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
