package algorithms.day006;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T021_LongestWordFinder {

    @Test
    public void testTypicalSentence() {
        assertEquals("extraordinarily",
                A021_LongestWordFinder.findLongestWord("Java is extraordinarily powerful"));
    }

    @Test
    public void testWithEqualLengthWords () {
        assertEquals("biggest", A021_LongestWordFinder.findLongestWord("small biggest large"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", A021_LongestWordFinder.findLongestWord(""));
    }



}

