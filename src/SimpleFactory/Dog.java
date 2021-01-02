package SimpleFactory;

public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("dog play");
    }

    @Override
    public void run() {
        System.out.println("dog run");
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
