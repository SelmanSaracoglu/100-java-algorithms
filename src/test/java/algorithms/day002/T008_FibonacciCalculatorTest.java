package algorithms.day002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T008_FibonacciCalculatorTest {

    @Test
    public void testFibonacciRecursive(){
        assertEquals(0, A008_FibonacciCalculator.fibonacciRecursive(0));
        assertEquals(1, A008_FibonacciCalculator.fibonacciRecursive(1));
        assertEquals(5, A008_FibonacciCalculator.fibonacciRecursive(5));
    }

    @Test
    public void testFibonacciIterative() {
        assertEquals(0, A008_FibonacciCalculator.fibonacciIterative(0));
        assertEquals(1, A008_FibonacciCalculator.fibonacciIterative(1));
        assertEquals(8, A008_FibonacciCalculator.fibonacciIterative(6));
    }
}
