import junit.framework.TestCase;
import org.junit.Test;

public class VowelsTest extends TestCase {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}