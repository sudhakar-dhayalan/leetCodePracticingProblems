package data_structures.creational.builder_pattern.builder_pattern.inner_static_builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;

    public User(UBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class UBuilder {

        private final String firstName;
        private final String lastName;
        private int age;
        private String email;

        public UBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public void print() {
        System.out.println(firstName + " " + lastName + " age is " + age + " and email id is " + email);
    }
}
