package algorithms.day007;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class T023_RemoveCharacterTest {

    @Test
    public void testRemoveLowerCase(){
        assertEquals("utomtion" , A023_RemoveCharacter.removeCharacter("automation", 'a'));
    }

    @Test
    public void testRemovedUpperCase(){
        assertEquals("utomtion", A023_RemoveCharacter.removeCharacter("Automation", 'a'));
    }
}
