package solid.DIP.GoodCode;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailService());
        emailService.notify("I am a good boy");

        NotificationService smsService = new NotificationService(new SMSService());
        smsService.notify("I am a good boy");

        NotificationService whatsappService = new NotificationService(new WhatsAppService());
        whatsappService.notify("I am a good boy");
    }
}
