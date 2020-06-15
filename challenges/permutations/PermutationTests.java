import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationTests {

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
    public void testPermutations_01() {
        String s = "abcdef";
        List<String> expectedResults = findPermutations(s);

        List<String> actualResults = Permutations.permutations(s);

        for (String res: expectedResults) {
            assertTrue(actualResults.contains(res));
        }
        for (String res: actualResults) {
            assertTrue(expectedResults.contains(res));
        }
    }

    @Test
    public void testPermutations_02() {
        String s = "jsfghlasljf";
        List<String> expectedResults = findPermutations(s);

        List<String> actualResults = Permutations.permutations(s);

        for (String res: expectedResults) {
            assertTrue(actualResults.contains(res));
        }
        for (String res: actualResults) {
            assertTrue(expectedResults.contains(res));
        }
    }
}
