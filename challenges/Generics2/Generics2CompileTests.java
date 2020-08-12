package Generics2;
import Generics2.Generics2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generics2CompileTests {

    public static void main(String[] args) {
        Generics2CompileTests tests = new Generics2CompileTests();
        tests.testDoubles();
        tests.testNumbers();
    }

    public void testNumbers() {
        List<Number> numbers = new ArrayList<>();
        Random r = new Random();

        numbers.add(r.nextInt());
        numbers.add(r.nextDouble());
        numbers.add(r.nextFloat());
        numbers.add(r.nextLong());

        List<Class> classes = Generics2.findNumberClasses(numbers);
    }

    public void testDoubles() {
        List<Double> doubles = new ArrayList<>();

        List<Class> classes = Generics2.findNumberClasses(doubles);
    }
}
