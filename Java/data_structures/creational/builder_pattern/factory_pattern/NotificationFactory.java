package data_structures.creational.builder_pattern.factory_pattern;

public class NotificationFactory {
    public static Notification createNotificationClass(NotificationType notificationType) {
        return switch (notificationType) {
            case SMS -> new SMSNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }
}
