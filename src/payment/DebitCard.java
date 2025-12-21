package payment;

public class DebitCard extends Card {
    DebitCard(String userName, Long cardNumber) {
        super(userName, cardNumber);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Debit Card: "+ getCardNumber());
    }
}
