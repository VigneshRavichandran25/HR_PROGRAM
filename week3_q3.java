// Interface class create pandren
interface EmailSender {
    void sendEmail(String msg);
}

interface SMSSender {
    void sendSMS(String msg);
}

interface PushNotificationSender {
    void sendPushNotification(String msg);
}

// Email Notification class la Emailsender interface class implement pandren
class EmailNotification implements EmailSender {
    public void sendEmail(String msg) {
        System.out.println("Email sent: " + msg);
    }
}

// SMS Notification class la SMSSender interface class implement pandren
class SMSNotification implements SMSSender {
    public void sendSMS(String msg) {
        System.out.println("SMS sent: " + msg);
    }
}

// Mobile App Notification class la PushNotificationSender interface class implement pandren
class MobileAppNotification implements PushNotificationSender {
    public void sendPushNotification(String msg) {
        System.out.println("Push Notification: " + msg);
    }
}

// Main create pandren 
public class NotificationSystem {
    public static void main(String[] args) {
// objects create pandren
        EmailSender email = new EmailNotification();
        email.sendEmail("Welcome!");

        SMSSender sms = new SMSNotification();
        sms.sendSMS("OTP: 1234");

        PushNotificationSender push = new MobileAppNotification();
        push.sendPushNotification("New message received");
    }
}
