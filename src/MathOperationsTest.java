import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    @Test
    public void testGcd_WithPositiveNumbers() {
        assertEquals(6, MathOperations.gcd(48, 18));
        assertEquals(1, MathOperations.gcd(5, 3));
        assertEquals(12, MathOperations.gcd(60, 36));
    }

    @Test
    public void testGcd_WithNegativeNumbers() {
        assertEquals(6, MathOperations.gcd(-48, 18));
        assertEquals(6, MathOperations.gcd(48, -18));
        assertEquals(1, MathOperations.gcd(-5, -3)); 
    }

    @Test
    public void testGcd_WithZero() {
        assertEquals(5, MathOperations.gcd(5, 0));
        assertEquals(0, MathOperations.gcd(0, 0));
        assertEquals(8, MathOperations.gcd(0, 8));
    }

    @Test
    public void testLcm_WithPositiveNumbers() {
        assertEquals(144, MathOperations.lcm(48, 18));
        assertEquals(15, MathOperations.lcm(5, 3));
        assertEquals(180, MathOperations.lcm(60, 36));
    }

    @Test
    public void testLcm_WithNegativeNumbers() {
        assertEquals(144, MathOperations.lcm(-48, 18));
        assertEquals(144, MathOperations.lcm(48, -18));
        assertEquals(15, MathOperations.lcm(-5, -3));
    }

    @Test
    public void testLcm_WithZero() {
        assertEquals(0, MathOperations.lcm(0, 5));
        assertEquals(0, MathOperations.lcm(5, 0));
        assertEquals(0, MathOperations.lcm(0, 0));
    }
}
