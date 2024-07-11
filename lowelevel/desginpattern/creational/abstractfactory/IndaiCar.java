package lowelevel.desginpattern.creational.abstractfactory;

public class IndaiCar implements Car {
    @Override
    public void start() {
        System.out.println("India start");
    }

    @Override
    public void stop() {
        System.out.println("India stop");
    }
}
