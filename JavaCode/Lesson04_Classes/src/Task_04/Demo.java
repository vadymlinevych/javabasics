package Task_04;

/**
 * 4. Модифицировать класс так, чтобы объект этого класса было невозможно создать с помощью операции new в коде другого класса
 * (сделать конструктор приватным), т.е. при попытке создать объект происходит ошибка компиляции: MaxBox box = new MaxBox(); --Error: private access ...
 * Вместо этого, для создания объекта использовать метод самого класса (метод должен создавать и возвращать объект):
 * MaxBox box = MaxBox.newInstance();
 */
public class Demo {
    public static void main(String args[]) {
        MaxBox box = MaxBox.newInstance();
        box.setValue(123);
        System.out.println(box.getValue()); //123
    }
}
