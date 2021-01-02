package factory;

public class Main {
    public static void main(String[] args) {

        //
        Factory squreFactory = new SqureFactory();

        Shape square = squreFactory.getShape();
        square.draw();
    }
}
