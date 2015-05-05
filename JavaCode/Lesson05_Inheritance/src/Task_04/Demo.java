package Task_04;

/**
 * 4. Написать иерархию классов «Фигуры». Фигура -> Треугольник,  Прямоугольник, Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры.
 */
public class Demo {
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(2.6, 4.0);
        Circle circle = new Circle(3.2);

        FigureList list = new FigureList();

        list.add(rectangle);
        list.add(triangle);
        list.add(circle);

        System.out.println("The square of figures are:");
        list.printSquare();

        System.out.println("The SORTED square of figures are:");
        list.sortSquare();

        System.out.println("The SORTED square of figures are:");
        list.printSquare();
    }
}
