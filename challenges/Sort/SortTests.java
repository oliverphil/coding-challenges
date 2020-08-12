package Sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import Sort.Sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTests {

    @Test
    public void testSorting_01() {
        Random numbers = new Random();
        for (int i=1; i<20; i++) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++){
                arr[j] = numbers.nextInt();
            }

            int[] actualResult = Sort.sort(Arrays.copyOf(arr, arr.length));

            Arrays.sort(arr);

            assertEquals(arr.length, actualResult.length);

            for (int j = 0; j < arr.length; j++) {
                assertEquals(arr[j], actualResult[j]);
            }
        }
    }

    @Test
    public void testSorting_02() {
        Random numbers = new Random();
        for (int i=1; i<20; i++) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++){
                arr[j] = numbers.nextInt();
            }

            int[] actualResult = Sort.sort(Arrays.copyOf(arr, arr.length));

            Arrays.sort(arr);

            assertEquals(arr.length, actualResult.length);

            for (int j = 0; j < arr.length; j++) {
                assertEquals(arr[j], actualResult[j]);
            }
        }
    }

    @Test
    public void testSorting_03() {
        Random numbers = new Random();
        for (int i=1; i<20; i++) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++){
                arr[j] = numbers.nextInt();
            }

            int[] actualResult = Sort.sort(Arrays.copyOf(arr, arr.length));

            Arrays.sort(arr);

            assertEquals(arr.length, actualResult.length);

            for (int j = 0; j < arr.length; j++) {
                assertEquals(arr[j], actualResult[j]);
            }
        }
    }
}
