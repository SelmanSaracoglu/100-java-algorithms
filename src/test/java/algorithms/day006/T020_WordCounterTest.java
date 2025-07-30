package algorithms.day006;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T020_WordCounterTest {

    @Test
    public void testTypicalSentence() {
        assertEquals(5, A020_WordCounter.countWords("Java is powerful and fun"));
    }

    @Test
    public void testSingleWord() {
        assertEquals(1, A020_WordCounter.countWords("selman"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, A020_WordCounter.countWords(""));
    }

    @Test
    public void testMultipleSpaces() {
        assertEquals(3, A020_WordCounter.countWords("   Java   rocks   hard  "));
    }
}
