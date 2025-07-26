package algorithms.day002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T006_PrimeCheckerTest {

    @Test
    public void testPrimeNumber(){
        assertTrue(A006_PrimeChecker.isPrime(7));
    }

    @Test
    public void testNonPrimeNumber(){
        assertFalse(A006_PrimeChecker.isPrime(8));
    }

    @Test
    public void testEdgeCaseZero(){
        assertFalse(A006_PrimeChecker.isPrime(0));
    }
    @Test
    public void testEdgeCaseOne() {
        assertFalse(A006_PrimeChecker.isPrime(1));
    }
}
