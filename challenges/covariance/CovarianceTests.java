package Covariance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import Covariance.Covariance.*;

public class CovarianceTests {

    @Test
    public void covarianceTest_01() {
        Human h = new CatOwner();

        Animal a = h.owns();
        assertEquals("Cat", a.whatAreYou());
        assertEquals(Cat.class, a.getClass());
    }

    @Test
    public void covarianceTest_02() {
        Human h = new DogOwner();

        Animal a = h.owns();
        assertEquals("Dog", a.whatAreYou());
        assertEquals(Dog.class, a.getClass());
    }

    @Test
    public void covarianceTest_03() {
        Animal a = new Animal();

        assertNotEquals("Dog", a.whatAreYou());
        assertNotEquals("Cat", a.whatAreYou());
    }

    @Test
    public void covarianceTest_04() {
        Animal a = new Pet();

        assertNotEquals("Dog", a.whatAreYou());
        assertNotEquals("Cat", a.whatAreYou());
    }
}
