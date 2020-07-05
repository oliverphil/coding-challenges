package ExceptionHandling2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ExceptionHandling2.ExceptionHandling2.*;

import java.util.concurrent.TimeUnit;

public class ExceptionHandling2Tests {

    private static final ExceptionHandling2 eh2 = new ExceptionHandling2();

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testInvalidAge_01() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("Lidia", -1));
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testInvalidAge_02() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("Adam", -100));
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testInvalidName_01() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("", 100));
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testInvalidName_02() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("", 10));
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testInvalidName_03() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person(null, 10));
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testInvalidNameAndAge() {
        assertThrows(IllegalArgumentException.class, () -> eh2.new Person("", -100));
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testValidPerson_01() {
        assertEquals("Marco:33", eh2.new Person("Marco",33).toString());
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testValidPerson_02() {
        assertEquals("Adam:13", eh2.new Person("Adam",13).toString());
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testValidPerson_03() {
        assertEquals("Godzilla:450000000", eh2.new Person("Godzilla",450000000).toString());
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void testValidPerson_04() {
        assertEquals("Lidia:83", eh2.new Person("Lidia",83).toString());
    }
}
