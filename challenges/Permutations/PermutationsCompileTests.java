package Permutations;

import Permutations.Permutations;

import java.util.ArrayList;
import java.util.List;


public class PermutationsCompileTests {

    public static void main(String[] args) {
        PermutationsCompileTests tests = new PermutationsCompileTests();
        tests.testPermutations_01();
    }

    public void testPermutations_01() {
        String s = "abcdef";
        List<String> actualResults = Permutations.permutations(s);
    }
}
