import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTypeTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleType.triangleType(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleType.triangleType(3, 3, 4));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", TriangleType.triangleType(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", TriangleType.triangleType(1, 2, 3));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", TriangleType.triangleType(3, 4, 5));
    }
}
