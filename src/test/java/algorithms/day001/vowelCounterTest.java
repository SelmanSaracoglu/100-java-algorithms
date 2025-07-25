package algorithms.day001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class vowelCounterTest {

    @Test
    public void testVowelsInSimpleString(){
        assertEquals(2, VowelCounter.countVowels("Hello"));
    }

    @Test
    public void testNoVowels(){
        assertEquals(0, VowelCounter.countVowels("hgfdt"));
    }

    @Test
    public void testUpperCaseVowels(){
        assertEquals(3, VowelCounter.countVowels("SELAMİ"));
    }
}
