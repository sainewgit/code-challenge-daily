package lowelevel.desginpattern.creational.abstractfactory;

public class UsaCarFactory implements CarFactory {
    public Car car() {return new UsaCar();}
}
