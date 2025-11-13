import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(6, 3);

        System.out.println("Circle area: " + circle.calculate_area());
        System.out.println("Square area: " + square.calculate_area());
        System.out.println("Triangle area: " + triangle.calculate_area());
    }
}
