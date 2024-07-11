package lowelevel.desginpattern.creational.factory;

public class Espresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Brewing espresso coffee...");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Pouring espresso into cup");
    }
}
