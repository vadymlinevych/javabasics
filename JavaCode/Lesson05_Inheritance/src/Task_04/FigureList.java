package Task_04;

import java.util.Arrays;

public class FigureList {

    Figure[] list = new Figure[100];
    int p = 0;

    public void add(Figure f) {
        list[p++] = f;
    }

    public void printSquare() {
        for(Figure t : list) {
            if (t != null) {
                System.out.format("%.2f%n", t.square());
            }
        }
    }

    public void sortSquare() {
        Arrays.sort(list, new FigureComparator());
    }
}
