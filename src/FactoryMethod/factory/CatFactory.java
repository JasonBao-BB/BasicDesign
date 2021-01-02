package FactoryMethod.factory;

import FactoryMethod.entity.Animal;
import FactoryMethod.entity.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Cat getAnimal() {
        return new Cat();
    }
}
