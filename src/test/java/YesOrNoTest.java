import junit.framework.TestCase;
import org.junit.Test;

public class YesOrNoTest extends TestCase {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}