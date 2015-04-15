package Task_04;

public class Account {
    int money;
    int limit;

    public int getLimit() {
        return limit;
    }

    public Account(int money, int limit) {
        this.money = money;
        this.limit = limit;
    }

    public int get() {
        return money;
    }

    public void set(int x) {
        money = x;
    }
}
