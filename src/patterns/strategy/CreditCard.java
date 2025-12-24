package patterns.strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay(float amount) {
        System.out.println("Payment through cc: " + amount);
    }
}
