package algorithms.day001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class ReverseStringTest {

    @Test
    public void testRevese_normalCase(){
        assertEquals("namleS", ReverseString.reverse("Selman"));
    }

    @Test
    public void testReverse_withSpaces(){
        assertEquals(" dlroW olleH", ReverseString.reverse("Hello World "));
    }



}
