package algorithms.day005;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T017_WordReverserTest {


    @Test
    public void testNormalSentence() {
        assertEquals("fun is Java", A017_WordReverser.reverseWords("Java is fun"));
    }

    @Test
    public void testWithExtraSpaces() {
        assertEquals("fun is Java", A017_WordReverser.reverseWords("   Java    is    fun    "));
    }

    @Test
    public void testWithSingleWord() {
        assertEquals("Hello", A017_WordReverser.reverseWords("Hello"));
    }


}
