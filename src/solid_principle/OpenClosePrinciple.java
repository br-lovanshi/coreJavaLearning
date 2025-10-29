package solid_principle;

import java.util.Objects;
import java.util.Scanner;

interface Notification{
    void notification();
}

class MailNotification implements Notification{
    @Override
    public void notification() {
        System.out.println("New Mail");
    }
}

class Sms implements Notification{
    @Override
    public void notification() {
        System.out.println("Sms notification");
    }
}

class WhatsApp implements Notification{
    @Override
    public void notification() {
        System.out.println("WhatsApp notfication");
    }
}
public class OpenClosePrinciple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notification notification;
        String input = scanner.nextLine();
        switch (input){
            case "Mail":
                notification = new MailNotification();
                break;
            case "SMS":
                notification = new Sms();
                break;
            case "WhatsApp":
                notification = new WhatsApp();
                break;
            default: notification = null;
        }

        if(Objects.nonNull(notification)) notification.notification();
    }
}
