package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightAngledTriangleTest {

    @Test
    void testTriangleArea() {
        RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3, 4, 5);
        assertEquals((3 * 4) / 2.0, triangle.area(), 0.0001);
    }

    @Test
    void testTrianglePerimeter() {
        RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3, 4, 5);
        assertEquals(3 + 4 + 5, triangle.perimeter(), 0.0001);
    }

    @Test
    void testTriangleToString() {
        RightAngledTriangle triangle = new RightAngledTriangle("MyTriangle", 6, 8, 10);
        assertEquals("Shape: MyTriangle, Base: 6.0, Height: 8.0, Hypotenuse: 10.0", triangle.toString());
    }
}