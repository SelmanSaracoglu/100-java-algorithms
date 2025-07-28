package algorithms.day004;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T015_DigitSumCalculatorTest {

    @Test
    public void testTypicalNumber() {
        assertEquals(10, A015_DigitSumCalculator.sumOfDigits(1234));
    }

    @Test
    public void testSingleDigit() {
        assertEquals(5, A015_DigitSumCalculator.sumOfDigits(5));
    }

    @Test
    public void testZero() {
        assertEquals(0, A015_DigitSumCalculator.sumOfDigits(0));
    }

}
