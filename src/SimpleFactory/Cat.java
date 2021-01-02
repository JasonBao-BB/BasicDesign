package SimpleFactory;

public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("cat play");
    }

    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
