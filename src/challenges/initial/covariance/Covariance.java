package challenges.initial.covariance;

class Animal {
    String whatAreYou() {
        return "I am an animal, maybe you want something more specific";
    }
}

class Pet extends Animal {
    String whatAreYou() {
        return "I am a pet, maybe you want something more specific";
    }
}

class Dog extends Pet {
    String whatAreYou() {
        return "Dog";
    }
}

class Cat extends Pet {
    String whatAreYou() {
        return "Cat";
    }
}

abstract class Human {
    abstract Animal owns();
}

abstract class PetOwner extends Human {
    abstract Pet owns();
}

class DogOwner extends PetOwner {
    Dog owns() {
        return new Dog();
    }
}

class CatOwner extends PetOwner {
    Cat owns() {
        return new Cat();
    }
}

public class Covariance {
}
