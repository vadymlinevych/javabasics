package Task_03;

/**
 * 3. Написать программу в стиле ООП,
 * которая будет рисовать на консоли прямоугольник с заданными длинами сторон.
 */
public class Demo {
    public static void main(String args[]) {

        Rectangle rec = new Rectangle(5, 15);
        char symbol = '*', space = ' ';
        rec.draw(symbol, space);
    }
}
