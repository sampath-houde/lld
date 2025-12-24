package patterns.strategy;

interface PaymentStrategy {
    void pay(float amount);
}

public class PaymentService {

    private final PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void pay(float amount) {
        paymentStrategy.pay(amount);
    }

}
