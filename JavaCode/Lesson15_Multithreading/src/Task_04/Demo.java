package Task_04;

/**
 4. Создать 100 потоков, каждый их которых выведет на экран свой номер
 и дождется, пока его прервут.
 */
public class Demo {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("MyThreads"); // группа потоков

        for (int i = 0; i < 100; i++) // создание 100 потоков
            new ThreadGetInfo(tg, "Thread " + i).start();

        tg.interrupt(); // завершение группы потоков
    }
}
