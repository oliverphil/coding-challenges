package challenges.initial.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTests {

    @Test
    public void testStringSearch_01() {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] searchArr = new int[]{5, 6, 7};

        assertTrue(Search.search(arr, searchArr));
    }

    @Test
    public void testStringSearch_02() {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] searchArr = new int[]{5, 6, 9};

        assertFalse(Search.search(arr, searchArr));
    }

}
