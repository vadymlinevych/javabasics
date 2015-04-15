package Task_01;

public class Action extends Thread {
    Account acc; //С какого аккаунта
    int withdraw; //..сколько снять.

    public Action(Account acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;

    }

    @Override
    public void run() {          // Синхронизация на аккаунте
        synchronized (acc) {              // Сколько остаток на счету?
            int has = acc.get();              // Остаток позволяет снять нужную сумму?
            int minLimit = acc.getLimit();
            if (has - withdraw >= minLimit) {                  // Устанавливаем новый баланс
                acc.set(acc.get() - withdraw);
            }
       }
    }
}