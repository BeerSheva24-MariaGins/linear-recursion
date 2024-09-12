package telran.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.RecursionMethods.*;
public class RecursionMethodsTest {
    
    @Test
    void factorialTest() {
        assertEquals(24, factorial(4));
        assertEquals(120, factorial(5));
        assertEquals(6, factorial(-3));
    }
    @Test
    void powTest() {
        assertEquals(9, pow(3, 2));
        assertEquals(27, pow(3, 3));
        assertEquals(81, pow(3, 4));
        assertEquals(100, pow(10, 2));
       
        assertEquals(100, pow(-10, 2));
        assertEquals(1000, pow(10, 3));
        assertEquals(-1000, pow(-10, 3));
        assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
    }
    @Test
    void squareTest() {
        assertEquals(9, square(3));
        assertEquals(16, square(4));
        assertEquals(25, square(5));       
        assertEquals(100, square(-10));
    }
}
