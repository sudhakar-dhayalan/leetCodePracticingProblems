package data_structures.creational.builder_pattern.builder_pattern.external_builder_class;

public class Users {
    public static UserBuilder builder(){
        return new UserBuilder();
    }
}
