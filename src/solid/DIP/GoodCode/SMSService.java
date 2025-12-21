package solid.DIP.GoodCode;

public class SMSService implements NotiifcationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending sms: "+ message);
    }
}
