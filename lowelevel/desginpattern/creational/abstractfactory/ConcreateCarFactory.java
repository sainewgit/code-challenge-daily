package lowelevel.desginpattern.creational.abstractfactory;

public class ConcreateCarFactory {

    public CarFactory getCarFactory(String region){

        switch (region) {
            case "US":
                return new UsaCarFactory();
            case "IN":
                return new IndaiCarFactory();
            default:
                throw new IllegalArgumentException("Unknown region");
        }
    }
}
