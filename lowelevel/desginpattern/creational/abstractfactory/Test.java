package lowelevel.desginpattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        ConcreateCarFactory c=new ConcreateCarFactory();
        CarFactory carFactory = c.getCarFactory("US");
        Car us = carFactory.car();
        us.start();
        us.stop();

    }
}
