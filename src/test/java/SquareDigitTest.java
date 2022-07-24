import junit.framework.TestCase;
import org.junit.Test;

public class SquareDigitTest extends TestCase {
    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(0, new SquareDigit().squareDigits(0));
    }

}

