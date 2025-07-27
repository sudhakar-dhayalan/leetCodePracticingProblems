package data_structures.creational.builder_pattern.external_builder_class;

public class Main {
    public static void main(String[] args) {
        User user = Users.builder()
                .setFirstName("John")
                .setLastName("Doe")
//                .setAge(24) // if not set, default value will be assigned, try commenting this line
                .setEmail("ifNotSet,WillBeNull@gmail.com")
                .builder();
        user.print();
    }
}
