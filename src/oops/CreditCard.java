package oops;

public class CreditCard extends Card {
    CreditCard(String userName, Long cardNumber) {
        super(userName, cardNumber);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card: "+ getCardNumber());
    }
}
