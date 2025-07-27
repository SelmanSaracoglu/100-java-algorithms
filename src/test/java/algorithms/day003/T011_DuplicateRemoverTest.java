package algorithms.day003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T011_DuplicateRemoverTest {

    @Test
    public void testWithDuplicates(){
        assertEquals("progamin", A011_DuplicateRemover.removeDuplicates("programming"));
    }
    @Test
    public void testAllUnique(){
        assertEquals("abc",A011_DuplicateRemover.removeDuplicates("abc"));
    }
    @Test
    public void testAllSame(){
        assertEquals("a", A011_DuplicateRemover.removeDuplicates("aaaaaaaaaaa"));
    }
}
