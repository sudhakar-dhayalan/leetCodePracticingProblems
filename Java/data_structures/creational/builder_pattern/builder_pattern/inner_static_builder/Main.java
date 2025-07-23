package data_structures.creational.builder_pattern.builder_pattern.inner_static_builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UBuilder("John", "Doe")
                .age(10)
                .email("without setting this, null value will be printed")
                .build();
        user.print();
    }
}
