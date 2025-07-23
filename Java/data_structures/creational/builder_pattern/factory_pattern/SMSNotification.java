package data_structures.creational.builder_pattern.factory_pattern;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");
    }
}
