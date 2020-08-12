package ExceptionHandling;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import ExceptionHandling.ExceptionHandling;

public class ExceptionHandlingCompileTests {

    public static void main(String args[]){
        ExceptionHandlingCompileTests tests = new ExceptionHandlingCompileTests();
        tests.exceptionHandlingValidTest();
    }

    public void exceptionHandlingValidTest() {
        ExceptionHandling.divide(1, 2);
    }
}
