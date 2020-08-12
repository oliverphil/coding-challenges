package Count;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import Count.Count;

public class CountCompileTests {

    public static void main(String args[]) {
        CountCompileTests tests = new CountCompileTests();
        tests.countTest_01();
    }

    public void countTest_01() {
        int actualCount = Count.count(new int[5], 1);
    }
}
