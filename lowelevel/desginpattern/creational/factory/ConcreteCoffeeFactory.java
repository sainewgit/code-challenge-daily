package lowelevel.desginpattern.creational.factory;

public class ConcreteCoffeeFactory extends CoffeFactory {

    @Override
    public Coffee getCoffee(String type) {
        return switch (type.toUpperCase()) {
            case "ESPRESSO" -> new Espresso();
            case "CAPPUCCINO" -> new Cappuccino();
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}
