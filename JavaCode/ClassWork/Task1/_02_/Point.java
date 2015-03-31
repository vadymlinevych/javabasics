package _02_;

/**
 * Created by Admin on 3/5/2015.
 */
public class Point{
    private int x;
    private int y;
    private int z;

    public void setX(int x) {
       if (x >= 0) this.x = x;
    }

    public void setY(int y) {
        if (y >= 0) this.y = y;
    }

    public void setZ(int z) {
        if (z >= 0) this.x = z;
    }

    public static int distance(Point first, Point second) {

        return (int)Math.sqrt(
                Math.pow(first.x - second.x, 2) +
                        Math.pow(first.y - second.y, 2) +
                        Math.pow(first.z - second.z, 2)
        );
    }

}