package Task_02;

/**
 2. Написать/дополнить класс Human. Реализовать его методы clone, equals, hashCode, toString
 */
public class Demo {
    public static void main(String[] args) {
        Human h1 = new Human("Petro", 160, 60);
        System.out.println(h1.hashCode());
        System.out.println(h1.toString());

        try {
            Human h2 = (Human)h1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
