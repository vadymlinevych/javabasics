package Task_04;

import java.util.ArrayList;

/**
 * 4. Создать 100 потоков, каждый их которых выведет на экран свой номер
 * и дождется, пока его прервут.

 NOT FINISHED YET!!!!!!!!!!!!!!!!1

 */
public class Demo {

    public static void main(String[] args) {

        ArrayList<Thread> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            ThreadGetInfo thread = new ThreadGetInfo();
            thread.start();
            list.add(thread);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Thread myThread : list) {
            myThread.interrupt();
        }
    }
}

