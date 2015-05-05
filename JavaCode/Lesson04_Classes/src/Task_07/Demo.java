package Task_07;

/**
 7. Написать класс, который умеет считать количество созданных объектов этого класса
 (подсказка: нужно прибегнуть к static)
 */
public class Demo {
    public static void main(String args[]) {

        Counter ob1 = new Counter();
        System.out.println(Counter.count);

        Counter ob2 = new Counter();
        System.out.println(Counter.count);
    }
}
