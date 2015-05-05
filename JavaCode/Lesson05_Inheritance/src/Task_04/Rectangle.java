package Task_04;

public class Rectangle extends Figure {

    public int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double square() {

        return height * width;
    }
}
