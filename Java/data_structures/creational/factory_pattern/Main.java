package data_structures.creational.factory_pattern;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotificationClass(NotificationType.EMAIL);
        notification.notifyUser();
    }
}
