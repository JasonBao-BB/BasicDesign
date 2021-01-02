package FactoryMethod;

import FactoryMethod.entity.Cat;
import FactoryMethod.entity.Dog;
import FactoryMethod.factory.CatFactory;
import FactoryMethod.factory.DogFactory;
import SimpleFactory.Factory;

public class Main {

    public static void main(String[] args) {

        CatFactory catFactroy = new CatFactory();
        DogFactory dogFactory = new DogFactory();

        Cat kuikui =  catFactroy.getAnimal();
        Dog youyou =  dogFactory.getAnimal();

        kuikui.eat();
        youyou.eat();
    }
}
