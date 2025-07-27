package algorithms.day004;

import org.junit.jupiter.api.Test;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class T014_DuplicateFinderTest {

    @Test
    public void testWithDuplicates () {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        Set<Integer> result = A014_DuplicateFinder.findDuplicates(arr);
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertEquals(2,result.size());
    }

    @Test
    public void testWithoutDuplicates () {
        int[] arr = {1, 2, 3, 4, 5};
        Set<Integer> result = A014_DuplicateFinder.findDuplicates(arr);
        assertTrue(result.isEmpty());
    }


}
