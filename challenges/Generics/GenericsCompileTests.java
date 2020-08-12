package Generics;

import java.util.Objects;
import java.util.Random;

import Generics.Generics.Box;

public class GenericsCompileTests {

    private static final Generics gn = new Generics();

    public static void main(String[] args) {
        GenericsCompileTests tests = new GenericsCompileTests();
        tests.testInt();
        tests.testString();
        tests.testClass();
    }

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

    public void testInt() {
        Box<Integer> intBox = gn.new Box<>(1);
        Integer i = intBox.getContents();
    }

    public void testString() {
        Box<String> stringBox = gn.new Box<>("testString");
        String s = stringBox.getContents();
    }

    public void testClass() {
        TestItem i = new TestItem();
        Box<TestItem> itemBox = gn.new Box<>(i);
        TestItem t = itemBox.getContents();
    }
}
