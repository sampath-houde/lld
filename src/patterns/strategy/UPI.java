package patterns.strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(float amount) {
        System.out.println("Payment through UPI: " + amount);
    }
}
