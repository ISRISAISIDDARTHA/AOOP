// Abstract Shape class
abstract class Shape {
    public abstract double calculateArea();
}

// Rectangle class
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Demonstration
 class OCPMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
    }
}
