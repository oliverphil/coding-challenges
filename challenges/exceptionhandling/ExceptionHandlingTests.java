package ExceptionHandling;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import ExceptionHandling.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTests {

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void exceptionHandlingValidTest() {
        Random numbers = new Random();

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(stream, true);
        System.setOut(out);

        for (int i=0; i<100; i++) {
            int a;
            int b;
            do {
                a = numbers.nextInt();
                b = numbers.nextInt();
            } while (b == 0);

            int expectedResult = a/b;
            ExceptionHandling.divide(a, b);

            String output = stream.toString();
            int calculatedResult = Integer.parseInt(output.split("\\\n")[0]);

            stream.reset();

            assertEquals(expectedResult, calculatedResult);
        }
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.SECONDS)
    public void handleDivide0() {
        int a = 100;
        int b = 0;

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(stream);
        System.setOut(out);

        assertDoesNotThrow(() -> ExceptionHandling.divide(a, b));

        String output = stream.toString();

        assertEquals("java.lang.ArithmeticException: / by zero", output.split("\\\n")[0]);
    }
}
