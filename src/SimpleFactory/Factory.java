package SimpleFactory;
/*
*  1.code reuse
*  2.code maintain ability
*  3.code readable
*
* */
public class Factory {
    //为什么好多程序员不用Switch 而疯狂用if-else
    public Animal getAnimal(String type){ //open and close
        if (type.equals("cat")) {
            return new Cat();
        } else if(type.equals("dog")) {
            return new Dog();
        }
        return null;
    }

    public static void main(String[] args) {
        Factory factory = new Factory();

        Animal cat = factory.getAnimal("cat");
        Animal dog = factory.getAnimal("dog");

        cat.eat();
        dog.eat();
    }
}
