package Task_02;

/**
 * 2.Модифицировать класс Counter так,
 * чтобы он циклически выводил числа из определенного диапазона.
 */
public class Demo {

    public static class Counter extends Thread {
        int from, to, sleepTime;

        public Counter(int from, int to, int sleepTime) {
            this.from = from;
            this.to = to;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {

            try {
                for (int i = from; i <= to; i++) {
                    System.out.println(i);
                    Thread.sleep(sleepTime);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int from = 1, to = 20, sleepTime = 500;
        try {

            Counter c = new Counter(from, to, sleepTime);
            c.start();
            c.join();

            System.out.println("Thread finished");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}