import junit.framework.TestCase;
import org.junit.Test;

public class ReturnNegativeTest extends TestCase {

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }
}