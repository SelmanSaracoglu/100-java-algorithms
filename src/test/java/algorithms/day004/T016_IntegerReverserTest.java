package algorithms.day004;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T016_IntegerReverserTest {

    @Test
    public void testReverseTypical(){
        assertEquals(4321, A016_IntegerReverser.reverse(1234));
    }

    @Test
    public void testReverseWithTrailingZeros() {
        assertEquals(1,A016_IntegerReverser.reverse(1000));
    }



}
