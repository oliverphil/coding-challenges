package challenges.initial.generics;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericsTests {

    class TestItem {
        int i;
        String s;
        double d;
        Class c;

        public TestItem() {
            Random r = new Random();
            i = r.nextInt();
            s = String.valueOf(r.nextInt());
            d = r.nextDouble();
            c = java.text.ParseException.class;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestItem testItem = (TestItem) o;
            return i == testItem.i &&
                    Double.compare(testItem.d, d) == 0 &&
                    Objects.equals(s, testItem.s) &&
                    Objects.equals(c, testItem.c);
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, s, d, c);
        }
    }

    @Test
    public void testInt() {
        Box<Integer> intBox = new Box<>(1);
        assertEquals(1, intBox.getContents());
    }

    @Test
    public void testString() {
        Box<String> stringBox = new Box<>("testString");
        assertEquals("testString", stringBox.getContents());
    }

    @Test
    public void testClass() {
        TestItem i = new TestItem();
        Box<TestItem> itemBox = new Box<>(i);
        assertEquals(i, itemBox.getContents());
    }
}
