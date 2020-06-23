package Max3;
import Max3.Max3;
import org.junit.jupiter.api.Test;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Max3Tests {

    private int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    @Test
    public void testMax3() {
        Random numbers = new Random();
        for(int i=0; i<100; i++) {
            int a = numbers.nextInt();
            int b = numbers.nextInt();
            int c = numbers.nextInt();

            int actualResult = findMax(a, b, c);
            int calculatedResult = Max3.max3(a, b, c);
            assertEquals(actualResult, calculatedResult);
        }
    }
}
