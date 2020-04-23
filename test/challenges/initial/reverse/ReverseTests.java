package challenges.initial.reverse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReverseTests {
    @Test
    public void testReverse_01() {
        int[] rev = new int[100];
        int[] arr = new int[100];
        Random r = new Random();
        for (int i=0; i<100; i++) {
            int n = r.nextInt();
            rev[100 - i - 1] = n;
            arr[i] = n;
        }

        int[] res = Reverse.reverse(arr);
        assertTrue(Arrays.equals(rev, res));
    }
}
