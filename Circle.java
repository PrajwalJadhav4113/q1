package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculate_area() {
        return Math.PI * radius * radius;
    }
}
