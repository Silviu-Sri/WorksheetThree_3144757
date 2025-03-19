package griffith;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void testCircleArea() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), 0.0001);
    }

    @Test
    void testCirclePerimeter() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), 0.0001);
    }
}
