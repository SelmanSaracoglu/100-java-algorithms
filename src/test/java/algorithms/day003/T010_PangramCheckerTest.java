package algorithms.day003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T010_PangramCheckerTest {

    @Test
    public void testValidPangram(){
        assertTrue(A010_PangramChecker.isPangram("The quick brown fox jumps over a lazy dog"));
    }

    @Test
    public void testIncompleteAlphabet() {
        assertFalse(A010_PangramChecker.isPangram("Hello World"));
    }

    @Test
    public void testEmptyString() {
        assertFalse(A010_PangramChecker.isPangram(""));
    }

    @Test
    public void testAllLettersManual() {
        assertTrue(A010_PangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }
}
