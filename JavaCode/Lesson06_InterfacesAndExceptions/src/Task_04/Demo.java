package Task_04;

/**
 * Продемонстрировать бросание и обработку исключений: ArithmeticException,
 * ClassCastException, IndexOutOfBoundsException, NullPointerException.
 */
public class Demo {

    public static void main(String[] args) {
        divide();
        nullException();
    }

    private static void divide() {
        try {
            int x = 1, y = 0;
            int z = x / y; // !!!
        } catch (ArithmeticException ex) {

            System.out.println("Деление на 0 !!!");
        }

    }

    private static void nullException(){
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw e;
        } finally {
            throw new IllegalStateException();
        }
    }
}