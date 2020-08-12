package Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;
import Reverse.Reverse;

public class ReverseCompileTests {

    public static void main(String[] args) {
        ReverseCompileTests tests = new ReverseCompileTests();
        tests.testReverse_01();
    }

    public void testReverse_01() {
        int[] res = Reverse.reverse(new int[5]);
    }
}
