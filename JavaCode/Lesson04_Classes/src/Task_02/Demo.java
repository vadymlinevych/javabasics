package Task_02;

/**
 2. Модифицировать класс так, чтобы в объект этого класса можно было сохранить только неотрицательное число,
 причем при попытках последующего сохранения различных чисел, объект запоминал и возвращал только наибольшее из них
 */
public class Demo {
    public static void main(String args[]) {
        MaxBox box = new MaxBox();
        box.setValue(-30);
        System.out.println(box.getValue()); //0
        box.setValue(10);
        box.setValue(150);
        box.setValue(70);
        System.out.println(box.getValue()); //150
    }
}
