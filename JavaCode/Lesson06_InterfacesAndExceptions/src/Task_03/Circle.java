package Task_03;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {

        return Math.PI * (radius * radius);
    }
}