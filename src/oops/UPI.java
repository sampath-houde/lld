package oops;

import oops.transaction.Payment;

public class UPI implements Payment {

    Long upiId;

    public UPI(Long upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI ID: " + upiId);
    }
}
