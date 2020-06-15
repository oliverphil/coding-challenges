import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTests {

    private int count(int[] arr, int search) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == search) count++;
        }
        return count;
    }

    @Test
    public void countTest_01() {
        Random r = new Random();
        for (int i=0; i<100; i++) {
            int[] arr = new int[100];
            for (int j=0; j<100; j++) {
                arr[j] = r.nextInt(15);
            }
            int countInt = r.nextInt(15);

            int expectedCount = count(arr, countInt);
            int actualCount = Count.count(arr, countInt);

            assertEquals(expectedCount, actualCount);
        }
    }
}
