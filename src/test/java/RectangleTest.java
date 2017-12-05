import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void calculatePerimeter() throws Exception {
        Rectangle rectangle = new Rectangle(20, 10);
        assertEquals(20 * 2 + 10 * 2, rectangle.calculatePerimeter(), 0);
    }

    @Test
    public void calculateArea() throws Exception {
        Rectangle rectangle = new Rectangle(20, 10);
        assertEquals(20 * 10, rectangle.calculateArea(), 0);
    }

}