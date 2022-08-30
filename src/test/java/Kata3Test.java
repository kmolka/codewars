import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata3Test {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata3.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Kata3.reverseWords("apple"));
        assertEquals("a b c d", Kata3.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", Kata3.reverseWords("double  spaced  words"));
        assertEquals("   ", Kata3.reverseWords("   "));
    }
}

