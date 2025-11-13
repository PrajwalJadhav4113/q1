package shapes;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculate_area() {
        return side * side;
    }
}
