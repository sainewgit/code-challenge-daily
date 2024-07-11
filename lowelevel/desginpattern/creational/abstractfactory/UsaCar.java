package lowelevel.desginpattern.creational.abstractfactory;

public class UsaCar implements Car {
    @Override
    public void start() {
        System.out.println("UsaCar start");
    }

    @Override
    public void stop() {
        System.out.println("UsaCar stop");
    }
}
