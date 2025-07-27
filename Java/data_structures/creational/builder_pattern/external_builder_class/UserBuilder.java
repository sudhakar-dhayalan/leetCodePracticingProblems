package data_structures.creational.builder_pattern.external_builder_class;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private int age = 18;
    private String email;

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public User builder() {
        return new User(firstName, lastName, age, email);
    }
}
