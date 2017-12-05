import static org.junit.Assert.*;

public class CircleTest {
    @org.junit.Test
    public void calculatePerimeter() throws Exception {
        Circle circle = new Circle(10);
        assertEquals(2*10*3.14, circle.calculatePerimeter(), 0);
    }

    @org.junit.Test
    public void calculateArea() throws Exception {
        Circle circle = new Circle(10);
        assertEquals(3.14 * 10 * 10, circle.calculateArea(), 0);
    }

}