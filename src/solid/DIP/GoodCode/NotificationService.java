package solid.DIP.GoodCode;

public class NotificationService {

    private NotiifcationChannel notiifcationChannel;

    NotificationService(NotiifcationChannel notiifcationChannel) {
        this.notiifcationChannel = notiifcationChannel;
    }

    public void notify(String message) {
        notiifcationChannel.send(message);
    }
}
