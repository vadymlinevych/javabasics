package Task_01;

/**
 * 1. Изменить решение задачи про банк так, чтобы баланс никогда не становился меньше 100 у.е.
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
