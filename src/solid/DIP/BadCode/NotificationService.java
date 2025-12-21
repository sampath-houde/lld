package solid.DIP.BadCode;

public class NotificationService {
    private final EmailService emailService;
    private final SMSService smsService;

    NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    void sendEmail(String message) {
        emailService.sendEmail(message);
    }

    void sendSMS(String message) {
        smsService.sendSMS(message);
    }
}
