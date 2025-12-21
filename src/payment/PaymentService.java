package payment;

import payment.transaction.Payment;

import java.util.HashMap;

public class PaymentService {

    // Storing + making payments

    HashMap<String, Payment> paymentMethods;

    PaymentService() {
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, Payment payment) {
        paymentMethods.put(name, payment);
    }

    public void makePayment(String name) {
        Payment payment = paymentMethods.get(name);
        payment.pay();
    }
}
