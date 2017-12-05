public class Circle implements Shape {

    private final double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius ;
    }

    public double calculateArea() {
        return  PI * radius * radius;
    }
}
