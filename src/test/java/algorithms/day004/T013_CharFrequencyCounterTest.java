package algorithms.day004;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class T013_CharFrequencyCounterTest {

    @Test
    public void testSimpleString () {
        Map<Character, Integer> result = A013_CharFrequencyCounter.countFrequencies("hello");
        assertEquals(2, result.get('l'));
        assertEquals(1, result.get('h'));
        assertEquals(1, result.get('e'));
        assertEquals(1, result.get('o'));
    }

    @Test
    public void testCaseInsensitivity(){
        Map<Character, Integer> result = A013_CharFrequencyCounter.countFrequencies("Aa");
        assertEquals(2, result.get('a'));
    }

    @Test
    public void testWithSpaces() {
        Map<Character, Integer> result = A013_CharFrequencyCounter.countFrequencies("a a a");
        assertEquals(3, result.get('a'));
    }
}
