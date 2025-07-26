package algorithms.day002;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T005_MaxValueFinderTest {


    @Test
    public void testMaxInPositiveArray() {
        int[] arr = {3, 5, 7, 2, 9, 13, 8, 19, 1};
        assertEquals(19, A005_MaxValueFinder.findMaxValue(arr));
    }

    @Test
    public void testMaxInNegativeArray() {
        int[] arr = {-10, -20, -3, -7, -50, -1};
        assertEquals(-1, A005_MaxValueFinder.findMaxValue(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        assertEquals(42, A005_MaxValueFinder.findMaxValue(arr));
    }

}
