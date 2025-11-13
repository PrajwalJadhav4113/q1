
interface Shape {
    double calculateArea();
}


class Circle implements Shape {
    private double radius;
    public Circle(double r) { this.radius = r; }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Square implements Shape {
    private double side;
    public Square(double s) { this.side = s; }
    @Override
    public double calculateArea() {
        return side * side;
    }
}


class AreaCalculator {
    public double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}


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

