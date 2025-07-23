package data_structures.creational.builder_pattern.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        BankSingleton instance_1 = BankSingleton.getInstance();
        BankSingleton instance_2 = BankSingleton.getInstance();

        instance_1.print();
        instance_2.print();
        System.out.println("---------");

        instance_1.setInitialVal("Overriding in 1st instance");

        System.out.println("Printing in second instance");
        instance_2.print();

        System.out.println(instance_1.equals(instance_2)); // always true

        System.out.println("There's only 1 instance and is passed on each object creation");
    }
}
