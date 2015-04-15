package Task_05;

/**
 * 5. Создать поток, который создаст 50 потоков, каждый из которых выведет на экран свой номер и дождется,
 * пока его прервут. Прерывание дочерних потоков должно выполнятся из потока их порождающего.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("MainTread started!");

        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();

        System.out.println("MainTread finished!");
    }

}
