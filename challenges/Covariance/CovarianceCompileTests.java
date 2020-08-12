package Covariance;

import Covariance.Covariance.*;

public class CovarianceCompileTests {

    private static final Covariance cov = new Covariance();

    public static void main(String args[]) {
        CovarianceCompileTests tests = new CovarianceCompileTests();
        tests.covarianceTest_01();
        tests.covarianceTest_02();
        tests.covarianceTest_03();
        tests.covarianceTest_04();
    }

    public void covarianceTest_01() {
        Human h = cov.new CatOwner();
        PetOwner po1 = cov.new CatOwner();
        PetOwner po2 = cov.new DogOwner();

        Animal a = h.owns();
        String s = a.whatAreYou();
    }

    public void covarianceTest_02() {
        Human h = cov.new DogOwner();

        Animal a = h.owns();
        String s = a.whatAreYou();
    }

    public void covarianceTest_03() {
        Animal a = cov.new Animal();
        String s = a.whatAreYou();
    }

    public void covarianceTest_04() {
        Animal a = cov.new Pet();
        String s = a.whatAreYou();
    }
}
