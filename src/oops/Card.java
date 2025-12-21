package oops;


import oops.transaction.Payment;

public abstract class Card implements Payment {

    private final Long cardNumber;

    private final String userName;

    Card(String userName, Long cardNumber) {
        this.userName = userName;
        this.cardNumber = cardNumber;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public String getUserName() {
        return userName;
    }

}
