package Task_04;

/**
 4. Решить задачу про банк с помощью java.util.concurrent.atomic.*
 */
public class Demo {
    public static void main(String[] args) throws Exception {

        int initialAmount = 1000;
        int limit  = 100;

        Account acc = new Account(initialAmount, limit);
        for (int i = 0; i < 1000; i++) {
            Action act = new Action(acc, 10);
            act.start();
            Thread.sleep(10);
        }
        Thread.sleep(5000);
        System.out.println(acc.get());
    }
}
