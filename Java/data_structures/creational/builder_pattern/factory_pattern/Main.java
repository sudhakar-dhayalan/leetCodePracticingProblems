package data_structures.creational.builder_pattern.factory_pattern;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotificationClass(NotificationType.EMAIL);
        notification.notifyUser();
    }
}
