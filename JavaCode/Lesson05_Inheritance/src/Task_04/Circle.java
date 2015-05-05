package Task_04;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
