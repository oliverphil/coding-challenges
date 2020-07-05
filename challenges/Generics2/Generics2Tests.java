package Generics2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import Generics2.Generics2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Generics2Tests {

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testNumbers() {
        List<Number> numbers = new ArrayList<>();
        Random r = new Random();

        numbers.add(r.nextInt());
        numbers.add(r.nextDouble());
        numbers.add(r.nextFloat());
        numbers.add(r.nextLong());

        List<Class> classes = Generics2.findNumberClasses(numbers);

        assertEquals(Integer.class, classes.get(0));
        assertEquals(Double.class, classes.get(1));
        assertEquals(Float.class, classes.get(2));
        assertEquals(Long.class, classes.get(3));
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testDoubles() {
        List<Double> doubles = new ArrayList<>();
        Random r = new Random();
        for (int i=0; i<100; i++) {
            doubles.add(r.nextDouble());
        }

        List<Class> classes = Generics2.findNumberClasses(doubles);
        assertEquals(100, classes.size());
        for (int i=0; i<100; i++) {
            assertEquals(Double.class, classes.get(i));
        }
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testStrings() {
        List<? extends Number> nums = new ArrayList<>();
        addString(nums);

        try {
            List<Class> classes = Generics2.findNumberClasses(nums);
            fail();
        } catch (Exception e) { }
    }

    private <T> void addString(List<T> list) {
        list.add((T) "hello world");
    }
}
