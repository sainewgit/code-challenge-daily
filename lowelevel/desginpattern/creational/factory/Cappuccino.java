package lowelevel.desginpattern.creational.factory;

public class Cappuccino implements Coffee{
    @Override
    public void prepare() {
        System.out.println("Cappucinno");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("pour Cappucinno");
    }
}
