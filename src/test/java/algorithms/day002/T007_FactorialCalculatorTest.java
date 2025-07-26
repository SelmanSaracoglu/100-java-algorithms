package algorithms.day002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T007_FactorialCalculatorTest {


    @Test
    public void testFactorialIterative() {
        assertEquals(120, A007_FactorialCalculator.factorialIterative(5));
        assertEquals(1, A007_FactorialCalculator.factorialIterative(1));
    }

    @Test
    public void testFactorialRecursive() {
        assertEquals(120, A007_FactorialCalculator.factorialRecursive(5));
        assertEquals(1, A007_FactorialCalculator.factorialRecursive(1));
    }


}
