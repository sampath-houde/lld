package patterns.creational.factory;

public class TransportService {
    public static void main(String[] args) throws IllegalAccessException {
        Transport transport = TransportFactory.createTransport("car");

        Transport transport2 = TransportFactory.createTransport("truck");

        Transport transport3 = TransportFactory.createTransport("bus");


        transport.deliever();
        transport2.deliever();
        transport3.deliever();
    }
}
