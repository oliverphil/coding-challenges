package challenges.initial.stringsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringSearchTests {

    @Test
    public void testStringSearch_01() {
        String text = "The quick brown fox jumps over the lazy dog";
        String searchString = "fox jumps";

        char[] textArray = text.toCharArray();
        char[] searchArray = searchString.toCharArray();

        assertTrue(StringSearch.search(textArray, searchArray));
    }

    @Test
    public void testStringSearch_02() {
        String text = "The quick brown fox jumps over the lazy dog";
        String searchString = "fox jumped";

        char[] textArray = text.toCharArray();
        char[] searchArray = searchString.toCharArray();

        assertFalse(StringSearch.search(textArray, searchArray));
    }

}
