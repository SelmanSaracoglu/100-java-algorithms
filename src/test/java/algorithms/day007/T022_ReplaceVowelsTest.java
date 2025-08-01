package algorithms.day007;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T022_ReplaceVowelsTest {

    @Test
    public void testTypicalString(){
        assertEquals("J*v* *s f*n", A022_ReplaceVowels.replaceVowelsWithAsterisk("Java is fun"));
    }

    @Test
    public void testAllVowels() {
        assertEquals("*****", A022_ReplaceVowels.replaceVowelsWithAsterisk("aeiou"));
    }

    @Test
    public void testUppercaseVowels() {
        assertEquals("*BCD", A022_ReplaceVowels.replaceVowelsWithAsterisk("ABCD"));
    }
}
