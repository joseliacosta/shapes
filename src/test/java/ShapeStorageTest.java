import org.junit.Test;
import org.w3c.dom.css.Rect;

import static org.junit.Assert.*;

public class ShapeStorageTest {

    @Test
    public void getTotalAreaWhenNoShapesAdded() throws Exception {
        ShapeStorage storage = new ShapeStorage();
        assertEquals(0, storage.getTotalArea(), 0);

    }

    @Test
    public void getTotalAreaWhenShapesGiven() throws Exception {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(5);

        ShapeStorage storage = new ShapeStorage();
        storage.add(square);
        storage.add(rectangle);
        storage.add(circle);

        double expectedArea = circle.calculateArea() + rectangle.calculateArea() + square.calculateArea();
        assertEquals(expectedArea, storage.getTotalArea(), 0);

    }

    @Test
    public void getShapesBiggerThan90OfArea() {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10,5);
        assertEquals();
    }
}