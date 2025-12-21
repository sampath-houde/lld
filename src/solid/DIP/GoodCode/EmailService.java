package solid.DIP.GoodCode;

public class EmailService implements NotiifcationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending email: "+ message);
    }
}
