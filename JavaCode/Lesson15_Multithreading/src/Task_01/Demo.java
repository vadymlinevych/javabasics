package Task_01;

/**
 1.Разобраться с методом fact (рекурсия).
 */
public class Demo {
    public static void main(String[] args) {
        int n = 5;
        Fact.Task t = new Fact.Task(n, new Fact.Finish());
        t.start();
    }
}
