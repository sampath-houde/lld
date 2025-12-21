package solid.DIP.GoodCode;

public class WhatsAppService implements NotiifcationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending whatsapp message "+message);
    }
}
