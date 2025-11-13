// 1. Abstraction (Closed for Modification)
interface Shape {
    double calculateArea();
}

// 2. Concrete Implementation (Open for Extension)
class Circle implements Shape {
    private double radius;
    public Circle(double r) { this.radius = r; }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 3. Concrete Implementation (Open for Extension)
class Square implements Shape {
    private double side;
    public Square(double s) { this.side = s; }
    @Override
    public double calculateArea() {
        return side * side;
    }
}

// 4. Client Logic (Closed for Modification)
class AreaCalculator {
    public double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

// Client Test
class OCPTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Circle(5),
            new Square(4)
        };
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: " + calculator.getTotalArea(shapes));
    }
}
