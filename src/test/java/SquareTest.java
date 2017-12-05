import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void calculateArea() throws Exception {
        Shape square = new Square(20);
        assertEquals(20 * 4, square.calculatePerimeter(), 0);
    }

    @Test
    public void calculatePerimeter() throws Exception {
        Shape square = new Square(20);
        assertEquals(20 * 20, square.calculateArea(), 0);
    }

}