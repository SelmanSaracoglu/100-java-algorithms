package algorithms.day003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T009_ArmstrongCheckerTest {

    @Test
    public void testValidArmstrongNumbers(){
        assertTrue(A009_ArmstrongChecker.isArmstrong(153));
        assertTrue(A009_ArmstrongChecker.isArmstrong(9474));
        assertTrue(A009_ArmstrongChecker.isArmstrong(370));
    }

    @Test
    public void testNonArmstrongNumbers() {
        assertFalse(A009_ArmstrongChecker.isArmstrong(123));
        assertFalse(A009_ArmstrongChecker.isArmstrong(100));
    }
}
