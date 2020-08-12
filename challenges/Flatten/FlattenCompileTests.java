package Flatten;

import java.util.*;

import Flatten.Flatten.*;

public class FlattenCompileTests {

    private static final Flatten flt = new Flatten();

    public static void main(String[] args) {
        FlattenCompileTests tests = new FlattenCompileTests();
        tests.testFlatten_01();
    }

    public void testFlatten_01() {
        Tree root = flt.new Tree(1);
        int[] actualResult = Flatten.flatten(root);
    }

}
