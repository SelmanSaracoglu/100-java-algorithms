package algorithms.day005;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T018_ArraySortedCheckerTest {

    @Test
    public void testAscendingArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals("ascending", A018_ArraySortedChecker.checkArraySorted(arr));
    }

    @Test
    public void testDescendingArray() {
        int[] arr = {9, 7, 5, 3, 1};
        assertEquals("descending", A018_ArraySortedChecker.checkArraySorted(arr));
    }

    public void testUnsortedArray() {
        int[] arr = {9, 7, 5, 3, 1, 11, 13};
        assertEquals("unsorted", A018_ArraySortedChecker.checkArraySorted(arr));
    }

    @Test
    public void testWithEmptyArray() {
        int[] arr = {};
        assertEquals("sorted", A018_ArraySortedChecker.checkArraySorted(arr));
    }



}
