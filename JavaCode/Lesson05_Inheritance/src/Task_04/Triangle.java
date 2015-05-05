package Task_04;

public class Triangle extends Figure {
    private double height, base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double square() {

        return (height * base) / 2;
    }
}
