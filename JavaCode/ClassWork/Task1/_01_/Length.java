package _01_;

import java.util.Scanner;

/**
 * Created by Admin on 3/5/2015.
 */
public class Length {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int z1 = scanner.nextInt();
        int z2 = scanner.nextInt();

        Point p1 = new Point();
        p1.x = x1;
        p1.y = y1;
        p1.z = z1;

        Point p2 = new Point();
        p2.x = x2;
        p2.y = y2;
        p2.z = z2;


        int dist = distance(p1, p2);

        int rez = distance(x1, x2, y1, y2);

        System.out.println(dist);
        System.out.println(rez);
    }

    public static int distance(int x1, int x2, int y1, int y2) {

        return (int)Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static int distance(Point first, Point second) {

        return (int)Math.sqrt(
                Math.pow(first.x - second.x, 2) +
                Math.pow(first.y - second.y, 2) +
                Math.pow(first.z - second.z, 2)
        );
    }

}

