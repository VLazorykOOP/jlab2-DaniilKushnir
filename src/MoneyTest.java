import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testConstructor_InvalidKopecks() {
        assertThrows(IllegalArgumentException.class, () -> new Money(10, (byte) 100));
        assertThrows(IllegalArgumentException.class, () -> new Money(10, (byte) -1));
    }

    @Test
    public void testAdd() {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 75);
        Money result = money1.add(money2);
        assertEquals(new Money(16, (byte) 25), result);
    }

    @Test
    public void testSubtract() {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 75);
        Money result = money1.subtract(money2);
        assertEquals(new Money(4, (byte) 75), result);
    }

    @Test
    public void testSubtract_InsufficientFunds() {
        Money money1 = new Money(5, (byte) 50);
        Money money2 = new Money(10, (byte) 75);
        assertThrows(IllegalArgumentException.class, () -> money1.subtract(money2));
    }

    @Test
    public void testDivide() {
        Money money = new Money(10, (byte) 50);
        Money result = money.divide(2);
        assertEquals(new Money(5, (byte) 25), result);
    }

    @Test
    public void testDivide_ByZero() {
        Money money = new Money(10, (byte) 50);
        assertThrows(ArithmeticException.class, () -> money.divide(0));
    }

    @Test
    public void testEquals() {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(10, (byte) 50);
        Money money3 = new Money(5, (byte) 75);
        assertTrue(money1.equals(money2));
        assertFalse(money1.equals(money3));
    }

    @Test
    public void testToString() {
        Money money = new Money(10, (byte) 5);
        assertEquals("10,05", money.toString());
    }

    @Test
    public void testCompare() {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 75);
        Money money3 = new Money(10, (byte) 50);
        
        assertTrue(Money.compare(money1, money2) > 0);
        assertTrue(Money.compare(money2, money1) < 0);
        assertEquals(0, Money.compare(money1, money3));
    }
}
