package ExceptionHandling2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ExceptionHandling2.ExceptionHandling2.*;

public class ExceptionHandling2Tests {

    private static final ExceptionHandling2 eh2 = new ExceptionHandling2();

    @Test
    public void testInvalidAge_01() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("Lidia", -1));
    }

    @Test
    public void testInvalidAge_02() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("Adam", -100));
    }

    @Test
    public void testInvalidName_01() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("", 100));
    }

    @Test
    public void testInvalidName_02() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("", 10));
    }

    @Test
    public void testInvalidName_03() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person(null, 10));
    }

    @Test
    public void testInvalidNameAndAge() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("", -100));
    }

    @Test
    public void testValidPerson_01() {
        assertEquals("Marco:33", eh2.new Person("Marco",33).toString());
    }

    @Test
    public void testValidPerson_02() {
        assertEquals("Adam:13", eh2.new Person("Adam",13).toString());
    }

    @Test
    public void testValidPerson_03() {
        assertEquals("Godzilla:450000000", eh2.new Person("Godzilla",450000000).toString());
    }

    @Test
    public void testValidPerson_04() {
        assertEquals("Lidia:83", eh2.new Person("Lidia",83).toString());
    }
}
