public class Rectangle implements Shape {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculatePerimeter() {
        return height * 2 + width * 2;
    }

    public double calculateArea() {
        return height * width;
    }
}
