package algorithms.day002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T004_AnagramCheckerTest {

    @Test
    public void testBasicAnagram() {
        assertTrue(A004_AnagramChecker.areAnagrams("listen", "silent"));
    }

    @Test
    public void testCaseInsensitiveAnagram(){
        assertTrue(A004_AnagramChecker.areAnagrams("Army", "Mary"));
    }

    @Test
    public void testNotAnagram(){
        assertFalse(A004_AnagramChecker.areAnagrams("Selman", "Hanse"));
    }



}
