package Task_05;

import java.util.ArrayList;

public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("MyThread started!");

        ArrayList<SubThread> threads = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            SubThread t = new SubThread();
            t.start();
            threads.add(t);
        }

        while (!isInterrupted()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }

        for (SubThread thread : threads) {
            thread.interrupt();
        }

        System.out.println("MyThread finished!");

    }
}