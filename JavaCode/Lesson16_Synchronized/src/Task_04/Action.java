package Task_04;

import java.util.concurrent.atomic.AtomicInteger;

public class Action extends Thread {
    Account acc; //С какого аккаунта
    int withdraw; //..сколько снять.

    public Action(Account acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;

    }

    @Override
    public void run() {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(acc.get());

        if (atomicInteger.addAndGet(-withdraw) >= acc.limit) {
            acc.set(atomicInteger.get());
        }
    }
}
