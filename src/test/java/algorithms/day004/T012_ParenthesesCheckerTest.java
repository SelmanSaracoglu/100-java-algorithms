package algorithms.day004;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T012_ParenthesesCheckerTest {

    @Test
    public void testBalancedSimple(){
        assertTrue(A012_ParenthesesChecker.isBalanced("()"));
        assertTrue(A012_ParenthesesChecker.isBalanced("{[]}"));
    }

    @Test
    public void testUnbalancedSimple(){
        assertFalse(A012_ParenthesesChecker.isBalanced("("));
        assertFalse(A012_ParenthesesChecker.isBalanced("{[)]}"));
    }
}
