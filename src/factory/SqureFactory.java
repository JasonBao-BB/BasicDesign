package factory;

public class SqureFactory extends Factory{
    @Override
    public Shape getShape() {
        return new Squre();
    }
}
