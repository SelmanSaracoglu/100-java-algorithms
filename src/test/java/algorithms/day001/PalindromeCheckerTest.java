package algorithms.day001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromeCheckerTest {

    @Test
    public void testSimplePalindrome(){
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    public void testCaseInsensitivePalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("RaceCar"));
    }

    @Test
    public void testPalindromeWithSpaces(){
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }
}
