import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1Test {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution1.whoLikesIt());
        assertEquals("Peter likes this", Solution1.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution1.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution1.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Solution1.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

}