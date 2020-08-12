package ExceptionHandling2;

import ExceptionHandling2.ExceptionHandling2.*;

public class ExceptionHandling2CompileTests {

    private static final ExceptionHandling2 eh2 = new ExceptionHandling2();

    public static void main(String args[]) {
        ExceptionHandling2CompileTests tests = new ExceptionHandling2CompileTests();
        tests.testPerson();
        tests.testValidPerson_01();
    }

    public void testPerson() {
        eh2.new Person("Lidia", 2);
    }

    public void testValidPerson_01() {
        eh2.new Person("Marco",33).toString();
    }
}
