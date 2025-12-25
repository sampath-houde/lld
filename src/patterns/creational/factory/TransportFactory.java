package patterns.creational.factory;

public class TransportFactory {

    public static Transport createTransport(String type) throws IllegalAccessException {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "truck" -> new Truck();
            case "bus" -> new Bus();
            default -> throw new IllegalAccessException("No transport found");
        };
    }

}
