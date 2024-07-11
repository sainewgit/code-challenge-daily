package lowelevel.desginpattern.creational.factory;

public class TestFactory {
    public static void main(String[] args) {

        CoffeFactory factory=new ConcreteCoffeeFactory();
        Coffee coffe = factory.getCoffee("CAPPUCCINO");
        coffe.pourIntoCup();
        coffe.prepare();
    }
}
