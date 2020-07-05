package Permutations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import Permutations.Permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class PermutationsTests {

    private List<String> findPermutations(String s) {
        List<String> permutations = new ArrayList<>();
        char[] ch = s.toCharArray();
        permutations(permutations, ch, 0);
        return permutations;
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    private static void permutations(List<String> permutations, char[] ch, int currentIndex) {
        if (currentIndex == ch.length - 1) {
            permutations.add(String.valueOf(ch));
        }

        for (int i = currentIndex; i < ch.length; i++) {
            swap(ch, currentIndex, i);
            permutations(permutations, ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }

    @Test
    @Timeout(value = 60, unit = TimeUnit.SECONDS)
    public void testPermutations_01() {
        String s = "abcdef";
        List<String> expectedResults = findPermutations(s);

        List<String> actualResults = Permutations.permutations(s);

        if (actualResults.isEmpty()) {
            fail();
        }

        for (String res: expectedResults) {
            assertTrue(actualResults.contains(res));
        }
        for (String res: actualResults) {
            assertTrue(expectedResults.contains(res));
        }
    }

    @Test
    @Timeout(value = 60, unit = TimeUnit.SECONDS)
    public void testPermutations_02() {
        String s = "jsfgsf";
        List<String> expectedResults = findPermutations(s);

        List<String> actualResults = Permutations.permutations(s);

        if (actualResults.isEmpty()) {
            fail();
        }

        for (String res: expectedResults) {
            assertTrue(actualResults.contains(res));
        }
        for (String res: actualResults) {
            assertTrue(expectedResults.contains(res));
        }
    }
}
