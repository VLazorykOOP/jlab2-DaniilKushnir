import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    public void testMagnitude() {
        Vector v = new Vector(3, 4, 0);
        assertEquals(5.0, v.magnitude(), 1e-9);
    }

    @Test
    public void testAdd() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        Vector result = v1.add(v2);
        assertEquals(new Vector(5, 7, 9), result);
    }

    @Test
    public void testMultiplyByScalar() {
        Vector v = new Vector(1, 2, 3);
        Vector result = v.multiplyByScalar(2);
        assertEquals(new Vector(2, 4, 6), result);
    }

    @Test
    public void testDotProduct() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        assertEquals(32.0, v1.dotProduct(v2), 1e-9);
    }

    @Test
    public void testCrossProduct() {
        Vector v1 = new Vector(1, 0, 0);
        Vector v2 = new Vector(0, 1, 0);
        Vector result = v1.crossProduct(v2);
        assertEquals(new Vector(0, 0, 1), result);
    }

    @Test
    public void testNormalize() {
        Vector v = new Vector(3, 4, 0);
        Vector normalized = v.normalize();
        assertEquals(new Vector(0.6, 0.8, 0), normalized);
    }

    @Test
    public void testNormalize_ZeroVector() {
        Vector v = new Vector(0, 0, 0);
        assertThrows(ArithmeticException.class, v::normalize);
    }

    @Test
    public void testConstructor_Array() {
        Vector v = new Vector(new double[]{1, 2, 3});
        assertEquals(new Vector(1, 2, 3), v);
    }

    @Test
    public void testConstructor_Array_Invalid() {
        assertThrows(IllegalArgumentException.class, () -> new Vector(new double[]{1, 2}));
    }
}
