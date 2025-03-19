package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RhombusTest {

    @Test
    void testRhombusArea() {
        Rhombus rhombus = new Rhombus("Rhombus", 4, 6, 5);
        assertEquals((4 * 6) / 2.0, rhombus.area(), 0.0001);
    }

    @Test
    void testRhombusPerimeter() {
        Rhombus rhombus = new Rhombus("Rhombus", 4, 6, 5);
        assertEquals(4 * 5, rhombus.perimeter(), 0.0001);
    }

    @Test
    void testRhombusToString() {
        Rhombus rhombus = new Rhombus("MyRhombus", 8, 10, 6);
        assertEquals("Shape: MyRhombus, Diagonals: 8.0 & 10.0, Side: 6.0", rhombus.toString());
    }
}