package FactoryMethod.factory;

import FactoryMethod.entity.Animal;
import FactoryMethod.entity.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
}
