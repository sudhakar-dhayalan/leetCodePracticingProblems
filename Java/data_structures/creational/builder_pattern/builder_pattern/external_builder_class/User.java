package data_structures.creational.builder_pattern.builder_pattern.external_builder_class;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;

    public User(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public void print() {
        System.out.println(firstName + " " + lastName + " age is " + age + " and email id is " + email);
    }

    public static class Users {
    }
}
