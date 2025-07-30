package algorithms.day006;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T019_CapitalizeWordsTest {

    @Test
    public void testNormalSentence() {
        assertEquals("Java Is Awesome", A019_CapitalizeWords.capitalizeEachWord("java is awesome"));
    }

    @Test
    public void testWithExtraSpaces() {
        assertEquals("Java Is Cool", A019_CapitalizeWords.capitalizeEachWord("  java    is   cool "));
    }

    @Test
    public void testWithAllUpperCase() {
        assertEquals("Hello", A019_CapitalizeWords.capitalizeEachWord("HELLO   "));
    }

}
