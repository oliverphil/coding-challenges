package Covariance;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import Covariance.Covariance.*;

public class CovarianceTests {

    private static final Covariance cov = new Covariance();

    @Test
    public void covarianceTest_01() {
        Human h = cov.new CatOwner();

        Animal a = h.owns();
        assertEquals("Cat", a.whatAreYou());
        assertEquals(Cat.class, a.getClass());
    }

    @Test
    public void covarianceTest_02() {
        Human h = cov.new DogOwner();

        Animal a = h.owns();
        assertEquals("Dog", a.whatAreYou());
        assertEquals(Dog.class, a.getClass());
    }

    @Test
    public void covarianceTest_03() {
        Animal a = cov.new Animal();

        assertNotEquals("Dog", a.whatAreYou());
        assertNotEquals("Cat", a.whatAreYou());
    }

    @Test
    public void covarianceTest_04() {
        Animal a = cov.new Pet();

        assertNotEquals("Dog", a.whatAreYou());
        assertNotEquals("Cat", a.whatAreYou());
    }
}
