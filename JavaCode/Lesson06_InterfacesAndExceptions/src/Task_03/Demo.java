package Task_03;

/**
 Задача про Фигуры. Дополнить.
 Создать список из нескольких фигур (2 прямоугольника, 4 окружности и тд.).
 Реализовать сортировку списка по возрастанию площади фигуры
 */
public class Demo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(2.6, 4.0);
        Circle circle = new Circle(3.2);

        FigureList list = new FigureList();

        list.add(rectangle);
        list.add(triangle);
        list.add(circle);

        list.printSquare();

        list.sortSquare();
    }
}
