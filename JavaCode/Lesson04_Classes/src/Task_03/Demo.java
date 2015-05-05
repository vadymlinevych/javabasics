package Task_03;

/**
 3. Добавить в класс константу MAX_VALUE = 1024, при попытке сохранить в объект число, превышающее MAX_VALUE,
 сохранять значение равное MAX_VALUE.
 */
public class Demo {
    public static void main(String args[]) {
        MaxBox box = new MaxBox();
        box.setValue(1025);
        box.setValue(-99999);
        System.out.println(box.getValue()); //1024
    }
}
