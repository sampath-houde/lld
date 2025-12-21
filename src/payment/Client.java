package payment;

import payment.transaction.Payment;

public class Client {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("Sampath Debit Card", new DebitCard("sampath", 45421L));
        paymentService.addPaymentMethod("Sankets Credit Card", new CreditCard("Sanket", 323523L));
        paymentService.addPaymentMethod("Sampaths UPI", new UPI(32324324L));

        paymentService.makePayment("Sampaths UPI");
        paymentService.makePayment("Sankets Credit Card");
        paymentService.makePayment("Sampath Debit Card");
    }
}
