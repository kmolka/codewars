import junit.framework.TestCase;
import org.junit.Test;

public class OppositeNumberTest extends TestCase {
    @Test
    public void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }

}