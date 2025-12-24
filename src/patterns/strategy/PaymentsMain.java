package patterns.strategy;

public class PaymentsMain {
    public static void main(String[] args) {
        PaymentService creditCard = new PaymentService(new CreditCard());
        PaymentService debitCard = new PaymentService(new DebitCard());
        PaymentService upi = new PaymentService(new UPI());

        creditCard.pay(100);

    }
}
