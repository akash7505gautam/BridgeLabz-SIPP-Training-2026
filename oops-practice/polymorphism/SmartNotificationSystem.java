class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {
    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipientName + ": " + message);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + recipientName + ": " + message);
    }
}

class PushNotification extends Notification {
    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName + ": " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {
        Notification[] notifications = {
            new EmailNotification("Nishant", "Welcome to our service!"),
            new SMSNotification("Rahul", "Your OTP is 456789"),
            new PushNotification("Priya", "You have a new message")
        };

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}