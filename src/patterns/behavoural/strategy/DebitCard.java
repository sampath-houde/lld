package patterns.behavoural.strategy;

public class DebitCard implements PaymentStrategy{
    @Override
    public void pay(float amount) {
        System.out.println("Payment through debit card: "+ amount);
    }
}
