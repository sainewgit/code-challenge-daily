package lowelevel.desginpattern.creational.abstractfactory;

public class IndaiCarFactory implements CarFactory {
    public Car car() {return new IndaiCar();}
}
