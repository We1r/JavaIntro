import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testFizzBuzz() {
        String result = Main.fizzBuzz();
        assertTrue(result.contains("fizzbuzz"));
        assertTrue(result.contains("fizz"));
        assertTrue(result.contains("buzz"));
    }

    @Test
    public void testReverseString() {
        String input = "make install";
        String expected = "llatsni ekam";
        assertEquals(expected, Main.reverseString(input));
    }

    @Test
    public void testSolveQuadratic() {
        assertEquals("x1 = 2.0, x2 = -1.0", Main.solveQuadratic(1, -1, -2));
        assertEquals("x = 1.0", Main.solveQuadratic(1, -2, 1));
        assertEquals("нет вещественных корней", Main.solveQuadratic(1, 0, 1));
    }

    @Test
    public void testCalculateSeriesSum() {
        double result = Main.calculateSeriesSum();
        assertTrue(result > 0);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Main.isPalindrome("А роза упала на лапу Азора"));
        assertFalse(Main.isPalindrome("Hello world"));
    }
}
