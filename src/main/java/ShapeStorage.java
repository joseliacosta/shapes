import java.util.ArrayList;
import java.util.List;

public class ShapeStorage {

    private List<Shape> shapes;

    public ShapeStorage() {
        shapes = new ArrayList<Shape>();
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getTotalArea() {
        return shapes.stream()
//                .mapToDouble(shape -> shape.calculateArea())
                .mapToDouble(Shape::calculateArea)
//                .reduce(0, (previousArea, currentArea) -> previousArea + currentArea);
                .sum();
    }

    public List<Shape> getBigShapes() {
        return new ArrayList<>();
    }
}
